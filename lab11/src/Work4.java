import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод года, месяца и дня
        System.out.println("Введите год (например, 2023): ");
        int year = scanner.nextInt();

        System.out.println("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Введите день месяца (1-31): ");
        int day = scanner.nextInt();

        // Ввод часов и минут
        System.out.println("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 1900, month - 1, day, hours, minutes);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        // Вывод результатов
        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());

        scanner.close();
    }
}
