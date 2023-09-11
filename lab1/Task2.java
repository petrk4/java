import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент №" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int i = 0;
        do{
            sum+= array[i]; i++;
        }while(i < size);

        // Поиск минимамального элемента
        int min1 = Integer.MAX_VALUE;
        for(int j = 0; j < size; j++){
            if(array[j] < min1) min1 = array[j];
        }

        // Поиск максимального элемента
        int max1 = Integer.MIN_VALUE;
        for(int j = 0; j < size; j++){
            if(array[j] > max1) max1 = array[j];
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max1);
        System.out.println("Минимальный элемент массива: " + min1);

        scanner.close();
    }
}
