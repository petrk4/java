import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");

        // Инициализация массива и ввод элементов
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент №" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);

        scanner.close();
    }
}