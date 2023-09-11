import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите чсило, факториал которого хотите посчитать: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных целых чисел.");
        }

        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
