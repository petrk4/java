package Task4;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <expression>");
            return;
        }

        String expression = args[0];

        ExpressionParser parser = new ExpressionParser();
        try {
            TripleExpression parsedExpression = parser.parse(expression);

            System.out.println("x  f");
            for (int x = 0; x <= 10; x++) {
                try {
                    int result = parsedExpression.evaluate(x, 0, 0);
                    System.out.println(x + "  " + result);
                } catch (ArithmeticException e) {
                    System.out.println(x + "  " + e.getMessage());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

