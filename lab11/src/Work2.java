import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        // Создаем объект SimpleDateFormat для форматирования даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Получаем текущую дату и время
        Date currentDate = new Date();

        // Ввод даты и времени от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время в формате 'yyyy-MM-dd HH:mm:ss': ");
        String userInput = scanner.nextLine();

        try {
            // Преобразуем введенную строку в объект Date
            Date userDate = dateFormat.parse(userInput);

            // Сравниваем даты
            if (userDate.after(currentDate)) {
                System.out.println("Введенная дата и время позже текущей.");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата и время раньше текущей.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей.");
            }
        } catch (Exception e) {
            System.out.println("Неверный формат введенной даты и времени.");
        } finally {
            scanner.close();
        }
    }
}
