package operators;

import exceptions.InvalidOperatorException;

import java.util.ArrayList;
import java.util.List;

public class Operators {

    private List<Operator> operators;

    public Operators() {
        this.operators = getListOfOperators();
    }

    public Operator find(String token) throws InvalidOperatorException {
        for (Operator operator : operators) {
            if (operator.getToken().equals(token)) {
                return operator;
            }
        }
        throw new InvalidOperatorException(token);
    }

    private List<Operator> getListOfOperators() {
        return new ArrayList<Operator>() {
            {
                add(new MinusOperator());
                add(new AddOperator());
                add(new TimesOperator());
                add(new DivideOperator());
                add(new AbsOperator());
                add(new SwapOperator());
                add(new DropOperator());
                add(new PowerOperator());
            }
        };
    }
}
