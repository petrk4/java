import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnesInSequence(scanner);
        System.out.println("Количество единиц в последовательности: " + count);
    }

    public static int countOnesInSequence(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                // Если введенное число равно 1, увеличиваем счетчик и рекурсивно вызываем функцию
                return 1 + countOnesInSequence(scanner);
            } else if (number == 0) {
                // Если введенное число равно 0, проверяем следующее число
                int nextNumber = scanner.nextInt();
                if (nextNumber == 0) {
                    // Если следующее число тоже 0, завершаем последовательность
                    return 0;
                } else {
                    // В противном случае продолжаем считать единицы
                    return countOnesInSequence(scanner);
                }
            } else {
                // Если введенное число не 0 и не 1, продолжаем считать следующие числа
                return countOnesInSequence(scanner);
            }
        }
        return 0; // Если ввод закончился
    }
}
