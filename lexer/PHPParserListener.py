# Generated from PHPParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PHPParser import PHPParser
else:
    from PHPParser import PHPParser

# This class defines a complete listener for a parse tree produced by PHPParser.
class PHPParserListener(ParseTreeListener):

    # Enter a parse tree produced by PHPParser#program.
    def enterProgram(self, ctx:PHPParser.ProgramContext):
        pass

    # Exit a parse tree produced by PHPParser#program.
    def exitProgram(self, ctx:PHPParser.ProgramContext):
        pass


    # Enter a parse tree produced by PHPParser#statement.
    def enterStatement(self, ctx:PHPParser.StatementContext):
        pass

    # Exit a parse tree produced by PHPParser#statement.
    def exitStatement(self, ctx:PHPParser.StatementContext):
        pass


    # Enter a parse tree produced by PHPParser#blockStatement.
    def enterBlockStatement(self, ctx:PHPParser.BlockStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#blockStatement.
    def exitBlockStatement(self, ctx:PHPParser.BlockStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#ifStatement.
    def enterIfStatement(self, ctx:PHPParser.IfStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#ifStatement.
    def exitIfStatement(self, ctx:PHPParser.IfStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#whileStatement.
    def enterWhileStatement(self, ctx:PHPParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#whileStatement.
    def exitWhileStatement(self, ctx:PHPParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#forStatement.
    def enterForStatement(self, ctx:PHPParser.ForStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#forStatement.
    def exitForStatement(self, ctx:PHPParser.ForStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#echoStatement.
    def enterEchoStatement(self, ctx:PHPParser.EchoStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#echoStatement.
    def exitEchoStatement(self, ctx:PHPParser.EchoStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#echoList.
    def enterEchoList(self, ctx:PHPParser.EchoListContext):
        pass

    # Exit a parse tree produced by PHPParser#echoList.
    def exitEchoList(self, ctx:PHPParser.EchoListContext):
        pass


    # Enter a parse tree produced by PHPParser#returnStatement.
    def enterReturnStatement(self, ctx:PHPParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#returnStatement.
    def exitReturnStatement(self, ctx:PHPParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#expressionStatement.
    def enterExpressionStatement(self, ctx:PHPParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by PHPParser#expressionStatement.
    def exitExpressionStatement(self, ctx:PHPParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by PHPParser#primary.
    def enterPrimary(self, ctx:PHPParser.PrimaryContext):
        pass

    # Exit a parse tree produced by PHPParser#primary.
    def exitPrimary(self, ctx:PHPParser.PrimaryContext):
        pass


    # Enter a parse tree produced by PHPParser#literal.
    def enterLiteral(self, ctx:PHPParser.LiteralContext):
        pass

    # Exit a parse tree produced by PHPParser#literal.
    def exitLiteral(self, ctx:PHPParser.LiteralContext):
        pass


    # Enter a parse tree produced by PHPParser#functionCall.
    def enterFunctionCall(self, ctx:PHPParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by PHPParser#functionCall.
    def exitFunctionCall(self, ctx:PHPParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by PHPParser#argumentList.
    def enterArgumentList(self, ctx:PHPParser.ArgumentListContext):
        pass

    # Exit a parse tree produced by PHPParser#argumentList.
    def exitArgumentList(self, ctx:PHPParser.ArgumentListContext):
        pass


    # Enter a parse tree produced by PHPParser#unaryExpr.
    def enterUnaryExpr(self, ctx:PHPParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by PHPParser#unaryExpr.
    def exitUnaryExpr(self, ctx:PHPParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by PHPParser#multiplicativeExpr.
    def enterMultiplicativeExpr(self, ctx:PHPParser.MultiplicativeExprContext):
        pass

    # Exit a parse tree produced by PHPParser#multiplicativeExpr.
    def exitMultiplicativeExpr(self, ctx:PHPParser.MultiplicativeExprContext):
        pass


    # Enter a parse tree produced by PHPParser#additiveExpr.
    def enterAdditiveExpr(self, ctx:PHPParser.AdditiveExprContext):
        pass

    # Exit a parse tree produced by PHPParser#additiveExpr.
    def exitAdditiveExpr(self, ctx:PHPParser.AdditiveExprContext):
        pass


    # Enter a parse tree produced by PHPParser#powerExpr.
    def enterPowerExpr(self, ctx:PHPParser.PowerExprContext):
        pass

    # Exit a parse tree produced by PHPParser#powerExpr.
    def exitPowerExpr(self, ctx:PHPParser.PowerExprContext):
        pass


    # Enter a parse tree produced by PHPParser#comparisonExpr.
    def enterComparisonExpr(self, ctx:PHPParser.ComparisonExprContext):
        pass

    # Exit a parse tree produced by PHPParser#comparisonExpr.
    def exitComparisonExpr(self, ctx:PHPParser.ComparisonExprContext):
        pass


    # Enter a parse tree produced by PHPParser#logicalExpr.
    def enterLogicalExpr(self, ctx:PHPParser.LogicalExprContext):
        pass

    # Exit a parse tree produced by PHPParser#logicalExpr.
    def exitLogicalExpr(self, ctx:PHPParser.LogicalExprContext):
        pass


    # Enter a parse tree produced by PHPParser#logicalWordExpr.
    def enterLogicalWordExpr(self, ctx:PHPParser.LogicalWordExprContext):
        pass

    # Exit a parse tree produced by PHPParser#logicalWordExpr.
    def exitLogicalWordExpr(self, ctx:PHPParser.LogicalWordExprContext):
        pass


    # Enter a parse tree produced by PHPParser#assignmentExpr.
    def enterAssignmentExpr(self, ctx:PHPParser.AssignmentExprContext):
        pass

    # Exit a parse tree produced by PHPParser#assignmentExpr.
    def exitAssignmentExpr(self, ctx:PHPParser.AssignmentExprContext):
        pass


    # Enter a parse tree produced by PHPParser#assignmentOperator.
    def enterAssignmentOperator(self, ctx:PHPParser.AssignmentOperatorContext):
        pass

    # Exit a parse tree produced by PHPParser#assignmentOperator.
    def exitAssignmentOperator(self, ctx:PHPParser.AssignmentOperatorContext):
        pass


    # Enter a parse tree produced by PHPParser#expr.
    def enterExpr(self, ctx:PHPParser.ExprContext):
        pass

    # Exit a parse tree produced by PHPParser#expr.
    def exitExpr(self, ctx:PHPParser.ExprContext):
        pass



del PHPParser