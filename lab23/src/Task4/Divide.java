package Task4;

public class Divide implements TripleExpression {
    private final TripleExpression left;
    private final TripleExpression right;

    public Divide(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        int divisor = right.evaluate(x, y, z);
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.evaluate(x, y, z) / divisor;
    }
}
