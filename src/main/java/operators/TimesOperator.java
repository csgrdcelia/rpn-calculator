package operators;

import exceptions.NotEnoughOperandException;

import java.util.Stack;

public class TimesOperator implements Operator {
    private String token = "*";

    public void calculate(Stack<Double> stack) throws NotEnoughOperandException {
        if(stack.size() < 2)
            throw new NotEnoughOperandException(this);
        double secondValue = stack.pop();
        double firstValue = stack.pop();
        stack.push(firstValue * secondValue);
    }

    public String getToken() {
        return token;
    }
}
