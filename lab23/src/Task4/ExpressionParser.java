package Task4;

public class ExpressionParser {

    private int pos;
    private String input;

    public TripleExpression parse(String expression) {
        pos = 0;
        input = expression.replaceAll("\\s+", "");
        return parseExpression();
    }

    private TripleExpression parseExpression() {
        TripleExpression left = parseTerm();
        while (pos < input.length()) {
            char operation = input.charAt(pos);
            if (operation == '+' || operation == '-') {
                pos++;
                TripleExpression right = parseTerm();
                if (operation == '+') {
                    left = new Add(left, right);
                } else {
                    left = new Subtract(left, right);
                }
            } else {
                break;
            }
        }
        return left;
    }

    private TripleExpression parseTerm() {
        TripleExpression left = parseFactor();
        while (pos < input.length()) {
            char operation = input.charAt(pos);
            if (operation == '*' || operation == '/') {
                pos++;
                TripleExpression right = parseFactor();
                if (operation == '*') {
                    left = new Multiply(left, right);
                } else {
                    left = new Divide(left, right);
                }
            } else {
                break;
            }
        }
        return left;
    }

    private TripleExpression parseFactor() {
        if (pos < input.length()) {
            char currentChar = input.charAt(pos);
            if (Character.isDigit(currentChar)) {
                return parseConst();
            } else if (currentChar == '-') {
                pos++;
                return new Subtract(new Const(0), parseFactor());
            } else if (currentChar == '(') {
                pos++;
                TripleExpression expression = parseExpression();
                pos++; // consume ')'
                return expression;
            } else {
                return parseVariable();
            }
        }
        throw new IllegalArgumentException("Invalid expression");
    }

    private TripleExpression parseConst() {
        int start = pos;
        while (pos < input.length() && (Character.isDigit(input.charAt(pos)) || input.charAt(pos) == '-')) {
            pos++;
        }
        try {
            return new Const(Integer.parseInt(input.substring(start, pos)));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid constant");
        }
    }

    private TripleExpression parseVariable() {
        if (pos < input.length() && Character.isLetter(input.charAt(pos))) {
            String variableName = Character.toString(input.charAt(pos));
            pos++;
            return new Variable(variableName);
        }
        throw new IllegalArgumentException("Invalid variable");
    }
}

