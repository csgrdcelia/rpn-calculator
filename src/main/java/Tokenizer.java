import exceptions.EmptyExpressionException;

import java.util.regex.Pattern;

public class Tokenizer {

    public Tokenizer() { }

    public String[] tokenize (String expression) throws EmptyExpressionException {
        if (expression.isEmpty()) {
            throw new EmptyExpressionException();
        }
        return expression.replace(',', '.').split(" ");
    }
}
