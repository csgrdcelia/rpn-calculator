import operators.Operator;
import operators.Operators;

import java.util.Stack;

public class Calculator {

    private Operators operators;
    private Stack<Double> stack;

    public Calculator() {
        operators = new Operators();
        stack = new Stack();
    }

    public double evaluate(String expression) throws Exception {

        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.tokenize(expression);

        for (String token : tokens) {

            if(isNumber(token)) {
                stack.push(Double.valueOf(token));
                continue;
            }

            operators.find(token).calculate(stack);
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        return token.matches("-?\\d+(\\.\\d+)?");
    }
}
