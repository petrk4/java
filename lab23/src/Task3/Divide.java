package Task3;

public class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        int divisor = right.evaluate(x);
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.evaluate(x) / divisor;
    }
}
