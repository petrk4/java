import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10 + random.nextInt(90) + 10;
        }

        String masString = "";

        for (int i = 0; i < mas.length; i++) {
            masString += mas[i];
            if (i < mas.length - 1) {
                masString += ", ";
            }
        }

        System.out.println("Массив: " + masString);

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Массив возрастает.");
        }
        else {
            System.out.println("Массив не возрастает.");
        }

    }
}
