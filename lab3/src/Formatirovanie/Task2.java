package Formatirovanie;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    private double price;
    public Task2(double price) {
        this.price = price;
    }

    public double buy(int count) {;
        return price * count;
    }

    public void convertToRub(double buy) {
        Locale locRU = new Locale("ru", "RU");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locRU);
        System.out.println("Стоимость в RUB: " + numberFormat.format(buy * 100));    }

    public void convertToEur(double buy) {
        Locale locFR = Locale.FRANCE;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locFR);
        System.out.println("Стоимость в EUR: " + numberFormat.format(buy * 1.07));;
    }

    public void convertToUs(double buy) {
        Locale locUS = Locale.US;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locUS);
        System.out.println("Стоимость в USD: " + numberFormat.format(buy));
    }

    public static void main (String[] args) {
        Task2 task2 = new Task2(10.0);
        int count = 0;


        while (true) {
            System.out.println("----ВСЁ ПО 10$----");
            System.out.println("1. Ввести кол-во товара.");
            System.out.println("2. Стоимость в RUB.");
            System.out.println("3. Стоимость в USD.");
            System.out.println("4. Стоимость в EUR.");
            System.out.println("5. Выход.");

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

            switch (x) {
                case 1 -> {
                    System.out.println("Введите кол-во: ");
                    count = sc.nextInt();
                }
                case 2 -> task2.convertToRub(task2.buy(count));
                case 3 -> task2.convertToUs(task2.buy(count));
                case 4 -> task2.convertToEur(task2.buy(count));
                case 5 -> System.exit(0);
            }
        }
    }
}
