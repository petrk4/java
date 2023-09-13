import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        double[] mas = new double[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random();
        }

        System.out.println("Массив (Math.random()) до сортировки: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    double x = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = x;
                }
            }
        }
        System.out.println("Массив (Math.random()) после сортировки: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        double[] mas1 = new double[10];
        Random random = new Random();

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = random.nextDouble();
        }

        System.out.println("Массив (Random) до сортировки: ");
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }

        for (int i = 0; i < mas1.length - 1; i++) {
            for (int j = 0; j < mas1.length - 1 - i; j++) {
                if (mas1[j] > mas1[j + 1]) {
                    double x = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = x;
                }
            }
        }

        System.out.println("Массив (Random) после сортировки: ");
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }
    }
}
