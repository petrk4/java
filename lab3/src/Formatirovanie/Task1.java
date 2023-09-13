package Formatirovanie;
import java.text.NumberFormat;
import java.util.Locale;

public class Task1 {
    private double kurs;
    public Task1(double kurs) {
        this.kurs = kurs;
    }
    public double convert(double sum) {
        return sum * kurs;
    }

    public static void main(String[] args) {
        double kurs = 0.01;
        double sum = 1123.13;

        Task1 task1 = new Task1(kurs);
        double inDol = task1.convert(sum);

        Locale locRU = new Locale("ru", "RU");
        Locale locUS = Locale.US;

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(locRU);
        System.out.println("Сумма в RUB: " + numberFormat1.format(sum));
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(locUS);
        System.out.println("Сумма в USD: " + numberFormat2.format(inDol));

    }
}
