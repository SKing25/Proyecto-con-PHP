// Variables globales
const codeInput = document.getElementById('codeInput');
const analyzeBtn = document.getElementById('analyzeBtn');
const clearBtn = document.getElementById('clearBtn');
const exampleBtn = document.getElementById('exampleBtn');
const resultsContainer = document.getElementById('resultsContainer');
const statusMessage = document.getElementById('statusMessage');
const tokenCountBadge = document.getElementById('tokenCount');
const totalTokensStat = document.getElementById('totalTokens');
const uniqueTokensStat = document.getElementById('uniqueTokens');
const codeLinesStat = document.getElementById('codeLines');
const analysisTimeStat = document.getElementById('analysisTime');
const fileInput = document.getElementById('fileInput');
const dropZone = document.getElementById('dropZone');
const fileInfo = document.getElementById('fileInfo');

// Estado actual
let activeTab = 'text'; // 'text' | 'file'
let isAnalyzing = false; // ← Fix bug: bandera de estado
let abortController = null; // Controlador para cancelar solicitudes

// Ejemplos de código
const EXAMPLES = {
    basic: `<?php
$nombre = "Juan";
$edad = 25;
echo "Hola " . $nombre;
?>`,
    loops: `<?php
for ($i = 0; $i < 10; $i++) {
    echo $i . " ";
}
?>`,
    functions: `<?php
function sumar($a, $b) {
    return $a + $b;
}
$resultado = sumar(5, 3);
echo $resultado;
?>`,
    oop: `<?php
class Persona {
    public $nombre;
    
    public function __construct($n) {
        $this->nombre = $n;
    }
}
?>`,
    array: `<?php
$numeros = [1, 2, 3, 4, 5];
$persona = ["nombre" => "Ana", "edad" => 30];
foreach ($persona as $key => $value) {
    echo "$key: $value";
}
?>`
};

// ============================================================
// TABS
// ============================================================
function switchTab(tab) {
    activeTab = tab;
    document.getElementById('tabText').classList.toggle('active', tab === 'text');
    document.getElementById('tabFile').classList.toggle('active', tab === 'file');
    document.getElementById('panelText').classList.toggle('active', tab === 'text');
    document.getElementById('panelFile').classList.toggle('active', tab === 'file');
}

// ============================================================
// SUBIDA DE ARCHIVOS
// ============================================================
dropZone.addEventListener('click', () => fileInput.click());

fileInput.addEventListener('change', (e) => {
    const file = e.target.files[0];
    if (file) cargarArchivo(file);
});

dropZone.addEventListener('dragover', (e) => {
    e.preventDefault();
    dropZone.classList.add('dragover');
});

dropZone.addEventListener('dragleave', () => {
    dropZone.classList.remove('dragover');
});

dropZone.addEventListener('drop', (e) => {
    e.preventDefault();
    dropZone.classList.remove('dragover');
    const file = e.dataTransfer.files[0];
    if (file) cargarArchivo(file);
});

function cargarArchivo(file) {
    if (!file.name.match(/\.(php|txt)$/i)) {
        mostrarError('Solo se permiten archivos .php o .txt');
        return;
    }
    const reader = new FileReader();
    reader.onload = (e) => {
        const contenido = e.target.result;
        fileInfo.textContent = `📄 ${file.name} (${(file.size / 1024).toFixed(1)} KB)`;
        fileInfo.classList.remove('hidden');
        // Guardar contenido en el textarea oculto para reutilizar lógica de análisis
        codeInput.value = contenido;
        mostrarExito(`Archivo cargado: ${file.name}`);
    };
    reader.onerror = () => mostrarError('Error al leer el archivo');
    reader.readAsText(file, 'UTF-8');
}

// ============================================================
// EVENT LISTENERS
// ============================================================
analyzeBtn.addEventListener('click', analizarCodigo);
clearBtn.addEventListener('click', limpiarCodigo);
exampleBtn.addEventListener('click', cargarEjemplo);

codeInput.addEventListener('keydown', (e) => {
    if (e.ctrlKey && e.key === 'Enter') analizarCodigo();
});

document.addEventListener('keydown', (e) => {
    if (e.ctrlKey && e.shiftKey && e.code === 'KeyC') limpiarCodigo();
});

// ============================================================
// ANÁLISIS — Botón siempre activo, sin desactivación
// ============================================================
async function analizarCodigo() {
    // Si ya está analizando, no hacer nada (evitar clics múltiples)
    if (isAnalyzing) {
        return;
    }

    const codigo = codeInput.value.trim();

    if (!codigo) {
        mostrarError('El código no puede estar vacío');
        return;
    }

    isAnalyzing = true;
    analyzeBtn.textContent = '⏳ Analizando...';
    statusMessage.classList.remove('show');
    const startTime = performance.now();
    
    // Cancelar solicitud anterior si existe
    if (abortController) {
        abortController.abort();
    }
    abortController = new AbortController();

    try {
        const timeoutId = setTimeout(() => {
            abortController.abort();
        }, 10000); // Timeout de 10 segundos

        const response = await fetch('/api/analizar', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ codigo }),
            signal: abortController.signal
        });

        clearTimeout(timeoutId);

        if (!response.ok) throw new Error(`Error HTTP: ${response.status}`);

        const data = await response.json();
        const tiempoAnalisis = (performance.now() - startTime).toFixed(2);

        if (data.exito) {
            mostrarResultados(data.tokens, tiempoAnalisis);
            actualizarEstadisticas(data.tokens, codigo);
            mostrarExito(`Análisis completado: ${data.total} tokens encontrados`);
        } else {
            mostrarError(data.error || 'Error desconocido');
        }
    } catch (error) {
        if (error.name === 'AbortError') {
            mostrarError('Análisis cancelado o timeout alcanzado');
        } else {
            mostrarError(`Error de conexión: ${error.message}`);
            console.error('Error:', error);
        }
    } finally {
        // Restaurar botón a estado normal
        isAnalyzing = false;
        analyzeBtn.textContent = '▶ Analizar';
    }
}

// ============================================================
// UI HELPERS
// ============================================================
function mostrarResultados(tokens, tiempoAnalisis) {
    if (tokens.length === 0) {
        resultsContainer.innerHTML = '<div class="empty-state"><p>No se encontraron tokens</p></div>';
        tokenCountBadge.textContent = '0 tokens';
        return;
    }

    let html = `<table class="token-table">
        <thead>
            <tr>
                <th style="width:20%">Tipo de Token</th>
                <th style="width:40%">Valor</th>
                <th style="width:15%">Línea</th>
                <th style="width:15%">Columna</th>
            </tr>
        </thead>
        <tbody>`;

    tokens.forEach((token) => {
        const isError = token.tipo === 'ERROR_CHAR';
        const rowClass = isError ? 'error-row' : '';
        const valor = escaparHTML(token.valor);
        html += `<tr class="${rowClass}">
            <td><span class="token-type ${isError ? 'token-error' : ''}">${token.tipo}</span></td>
            <td><code class="token-value">${valor}</code></td>
            <td><span class="token-position">L${token.linea}</span></td>
            <td><span class="token-position">C${token.columna}</span></td>
        </tr>`;
    });

    html += '</tbody></table>';
    resultsContainer.innerHTML = html;
    tokenCountBadge.textContent = `${tokens.length} tokens`;
    analysisTimeStat.textContent = tiempoAnalisis + 'ms';
}

function actualizarEstadisticas(tokens, codigo) {
    totalTokensStat.textContent = tokens.length;
    const tiposUnicos = new Set(tokens.map(t => t.tipo));
    uniqueTokensStat.textContent = tiposUnicos.size;
    codeLinesStat.textContent = codigo.split('\n').length;
}

function limpiarCodigo() {
    codeInput.value = '';
    fileInput.value = '';
    fileInfo.textContent = '';
    fileInfo.classList.add('hidden');
    resultsContainer.innerHTML = '<div class="empty-state"><p>👇 Analiza código para ver los tokens</p></div>';
    statusMessage.classList.remove('show');
    tokenCountBadge.textContent = '0 tokens';
    totalTokensStat.textContent = '0';
    uniqueTokensStat.textContent = '0';
    codeLinesStat.textContent = '0';
    analysisTimeStat.textContent = '0ms';
    analyzeBtn.textContent = '▶ Analizar';
    codeInput.focus();
}

function cargarEjemplo() {
    const ejemplos = Object.values(EXAMPLES);
    codeInput.value = ejemplos[Math.floor(Math.random() * ejemplos.length)];
    switchTab('text');
    codeInput.focus();
    setTimeout(analizarCodigo, 300);
}

function mostrarError(mensaje) {
    statusMessage.textContent = '❌ ' + mensaje;
    statusMessage.className = 'status-message error show';
}

function mostrarExito(mensaje) {
    statusMessage.textContent = '✅ ' + mensaje;
    statusMessage.className = 'status-message success show';
}

function escaparHTML(texto) {
    const map = { '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#039;' };
    return texto.replace(/[&<>"']/g, m => map[m]);
}

// Init
document.addEventListener('DOMContentLoaded', () => {
    codeInput.focus();
    fetch('/api/info').then(r => r.json()).then(d => console.log('API:', d)).catch(() => {});
});