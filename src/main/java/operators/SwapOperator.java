package operators;

import exceptions.NotEnoughOperandException;

import java.util.Stack;

public class SwapOperator implements Operator {
    private String token = "swap";

    public void calculate(Stack<Double> stack) throws NotEnoughOperandException {
        if(stack.size() < 2)
            throw new NotEnoughOperandException(this);

        double secondValue = stack.pop();
        double firstValue = stack.pop();

        stack.push(secondValue);
        stack.push(firstValue);
    }

    public String getToken() {
        return token;
    }
}
