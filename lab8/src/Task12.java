import java.util.Scanner;
import java.util.ArrayList;
public class Task12 {
    public static void main(String[] args) {
        printOddNumbersInSequence();
    }

    public static void printOddNumbersInSequence() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            return; // Базовый случай: если введено 0, завершаем рекурсию
        }

        if (number % 2 != 0) {
            System.out.println(number); // Выводим нечетное число
        }

        printOddNumbersInSequence(); // Рекурсивно вызываем функцию для следующего числа
    }
}
