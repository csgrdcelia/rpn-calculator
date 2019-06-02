package operators;

import exceptions.NotEnoughOperandException;

import java.util.Stack;

public class DropOperator implements Operator {
    private String token = "drop";

    public void calculate(Stack<Double> stack) throws NotEnoughOperandException {
        if(stack.size() < 1)
            throw new NotEnoughOperandException(this);

        stack.pop();
    }

    public String getToken() {
        return token;
    }
}
