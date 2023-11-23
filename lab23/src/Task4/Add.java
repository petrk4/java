package Task4;

public class Add implements TripleExpression {
    private final TripleExpression left;
    private final TripleExpression right;

    public Add(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return left.evaluate(x, y, z) + right.evaluate(x, y, z);
    }
}
