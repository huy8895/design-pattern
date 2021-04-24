package interpreter.example.caculator.expression;

import interpreter.example.caculator.Expression;
import interpreter.example.caculator.InterpreterEngineContext;

public class SubtractExpression implements Expression {
    private String expression;

    public SubtractExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.subtract(expression);
    }
}
