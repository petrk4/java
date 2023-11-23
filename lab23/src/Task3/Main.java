package Task3;

public class Main {
    public static void main(String[] args) {
        // Создаем выражение x^2 - 2x + 1
        Expression expression = new Subtract(
                new Add(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(-2), new Variable("x"))
                ),
                new Const(1)
        );

        // Вычисляем значение выражения для x = 5
        int result = expression.evaluate(5);
        System.out.println("Result: " + result);

        if (args.length != 1) {
            System.out.println("Usage: java Main <value_of_x>");
            return;
        }

        // Получаем значение x из командной строки
        int x = Integer.parseInt(args[0]);

        // Создаем выражение x^2 - 2x + 1
        Expression expressio = new Subtract(
                new Add(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(-2), new Variable("x"))
                ),
                new Const(1)
        );

        // Вычисляем значение выражения для заданного x
        int result1 = expressio.evaluate(x);
        System.out.println("Result: " + result1);
    }
}
