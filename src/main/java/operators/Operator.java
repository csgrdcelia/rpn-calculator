package operators;

import exceptions.NotEnoughOperandException;

import java.util.Stack;

public interface Operator {
    String getToken();
    void calculate(Stack<Double> stack) throws NotEnoughOperandException;
}
