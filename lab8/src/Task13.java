import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите натуральные числа (0 для завершения):");
        printOddPositionNumbers();
    }

    public static void printOddPositionNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num != 0) {
            if (num % 2 != 0) {
                System.out.println(num); // Выводим число, если его номер нечетный
            }

            // Рекурсивно вызываем функцию для следующего числа
            printOddPositionNumbers();
        }
    }
}
