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

// Event Listeners
analyzeBtn.addEventListener('click', analizarCodigo);
clearBtn.addEventListener('click', limpiarCodigo);
exampleBtn.addEventListener('click', cargarEjemplo);
codeInput.addEventListener('keydown', (e) => {
    if (e.ctrlKey && e.key === 'Enter') {
        analizarCodigo();
    }
});

// Función principal de análisis
async function analizarCodigo() {
    const codigo = codeInput.value.trim();
    
    if (!codigo) {
        mostrarError("El código no puede estar vacío");
        return;
    }
    
    // Mostrar estado de cargando
    mostrarCargando();
    const startTime = performance.now();
    
    try {
        const response = await fetch('/api/analizar', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ codigo: codigo })
        });
        
        if (!response.ok) {
            throw new Error(`Error HTTP: ${response.status}`);
        }
        
        const data = await response.json();
        const endTime = performance.now();
        const tiempoAnalisis = (endTime - startTime).toFixed(2);
        
        if (data.exito) {
            mostrarResultados(data.tokens, tiempoAnalisis);
            actualizarEstadisticas(data.tokens, codigo);
            mostrarExito(`Análisis completado: ${data.total} tokens encontrados`);
        } else {
            mostrarError(data.error || "Error desconocido");
        }
    } catch (error) {
        mostrarError(`Error de conexión: ${error.message}`);
        console.error('Error:', error);
    }
}

// Mostrar resultados en tabla
function mostrarResultados(tokens, tiempoAnalisis) {
    if (tokens.length === 0) {
        resultsContainer.innerHTML = '<div class="empty-state"><p>No se encontraron tokens</p></div>';
        tokenCountBadge.textContent = '0 tokens';
        return;
    }
    
    let html = `<table class="token-table">
        <thead>
            <tr>
                <th style="width: 20%">Tipo de Token</th>
                <th style="width: 40%">Valor</th>
                <th style="width: 15%">Línea</th>
                <th style="width: 15%">Columna</th>
            </tr>
        </thead>
        <tbody>`;
    
    tokens.forEach((token, index) => {
        const valor = escaparHTML(token.valor);
        html += `<tr>
            <td><span class="token-type">${token.tipo}</span></td>
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

// Actualizar estadísticas
function actualizarEstadisticas(tokens, codigo) {
    // Total de tokens
    totalTokensStat.textContent = tokens.length;
    
    // Tokens únicos
    const tiposUnicos = new Set(tokens.map(t => t.tipo));
    uniqueTokensStat.textContent = tiposUnicos.size;
    
    // Líneas de código
    const lineas = codigo.split('\n').length;
    codeLinesStat.textContent = lineas;
}

// Limpiar código
function limpiarCodigo() {
    codeInput.value = '';
    resultsContainer.innerHTML = '<div class="empty-state"><p>👇 Analiza código para ver los tokens</p></div>';
    statusMessage.classList.remove('show');
    tokenCountBadge.textContent = '0 tokens';
    totalTokensStat.textContent = '0';
    uniqueTokensStat.textContent = '0';
    codeLinesStat.textContent = '0';
    analysisTimeStat.textContent = '0ms';
    codeInput.focus();
}

// Cargar ejemplo aleatorio
function cargarEjemplo() {
    const ejemplos = Object.values(EXAMPLES);
    const ejemploAleatorio = ejemplos[Math.floor(Math.random() * ejemplos.length)];
    codeInput.value = ejemploAleatorio;
    codeInput.focus();
    // Auto-analizar después de cargar el ejemplo
    setTimeout(analizarCodigo, 300);
}

// Mostrar error
function mostrarError(mensaje) {
    statusMessage.textContent = '❌ ' + mensaje;
    statusMessage.className = 'status-message error show';
    analyzeBtn.disabled = false;
    analyzeBtn.textContent = '▶ Analizar';
}

// Mostrar éxito
function mostrarExito(mensaje) {
    statusMessage.textContent = '✅ ' + mensaje;
    statusMessage.className = 'status-message success show';
}

// Mostrar cargando
function mostrarCargando() {
    analyzeBtn.disabled = true;
    analyzeBtn.innerHTML = '<span class="loading"></span> Analizando...';
    statusMessage.classList.remove('show');
}

// Escapar HTML para evitar inyecciones
function escaparHTML(texto) {
    const map = {
        '&': '&amp;',
        '<': '&lt;',
        '>': '&gt;',
        '"': '&quot;',
        "'": '&#039;'
    };
    return texto.replace(/[&<>"']/g, m => map[m]);
}

// Inicializar
document.addEventListener('DOMContentLoaded', () => {
    codeInput.focus();
    // Cargar información del servidor
    fetch('/api/info')
        .then(r => r.json())
        .then(data => {
            console.log('API Info:', data);
        })
        .catch(e => console.error('Error loading info:', e));
});

// Teclado atajo: Ctrl + Shift + C para limpiar
document.addEventListener('keydown', (e) => {
    if (e.ctrlKey && e.shiftKey && e.code === 'KeyC') {
        limpiarCodigo();
    }
});
