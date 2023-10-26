package src;

public class MathFuncTest {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        // Calculate the circumference using PI
        double radius = 5.0;  // Radius of the circle
        double circumference = 2 * mathFunc.getPi() * radius;
        System.out.println("Circumference of the circle: " + circumference);

        // Calculate power
        double base = 2.0;
        double exponent = 3.0;
        double result = mathFunc.power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Calculate the modulus of a complex number
        double realPart = 3.0;
        double imaginaryPart = 4.0;
        double modulus = mathFunc.complexNumberModulus(realPart, imaginaryPart);
        System.out.println("Modulus of the complex number (" + realPart + " + " + imaginaryPart + "i) is: " + modulus);
    }
}