package operators;

import exceptions.NotEnoughOperandException;
import java.util.Stack;

import static java.lang.StrictMath.abs;

public class AbsOperator implements Operator {
    public String token = "abs";

    public void calculate(Stack<Double> stack) throws NotEnoughOperandException {
        if(stack.size() < 1)
            throw new NotEnoughOperandException(this);

        double value = stack.pop();

        stack.push(abs(value));
    }

    public String getToken() {
        return token;
    }
}
