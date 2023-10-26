package src;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexNumberModulus(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    @Override
    public double getPi() {
        return Math.PI;
    }
}