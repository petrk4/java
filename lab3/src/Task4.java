import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите натуральное число (размер массива): ");
            n = scanner.nextInt();

        } while (n <= 0);

        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(n + 1);
        }

        System.out.println("Массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                count++;
            }
        }

        if (count > 0) {
            int[] mas1 = new int[count];
            int ind = 0;
            int x = 0;
            while (x < n) {
                if (mas[x] % 2 == 0) {
                    mas1[ind] = mas[x];
                    ind++;
                }
                x++;
            }

            System.out.println("Массив четный: ");
            for (int i = 0; i < mas1.length; i++) {
                System.out.println(mas1[i]);
            }
        } else {
            System.out.println("Четных чисел нет.");
        }
    }
}
