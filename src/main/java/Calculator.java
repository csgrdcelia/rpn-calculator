import operators.Operators;

import java.util.Stack;

public class Calculator {

    private Operators operators;
    private Stack<Double> operands;

    public Calculator() {
        operators = new Operators();
        operands = new Stack();
    }

    public double evaluate(String expression) throws Exception {

        String[] tokens = new Tokenizer().tokenize(expression);

        for (String token : tokens) {
            if(isNumber(token)) {
                operands.push(Double.valueOf(token));
            } else {
                operators.find(token).calculate(operands);
            }
        }

        return operands.pop();
    }

    private boolean isNumber(String token) {
        return token.matches("-?\\d+(\\.\\d+)?");
    }
}
