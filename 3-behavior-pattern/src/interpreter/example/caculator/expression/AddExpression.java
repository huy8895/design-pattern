package interpreter.example.caculator.expression;

import interpreter.example.caculator.Expression;
import interpreter.example.caculator.InterpreterEngineContext;

public class AddExpression implements Expression {
    private String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.add(expression);
    }
}
