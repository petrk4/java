import java.util.Date;

public class Work1 {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Ваша_фамилия";

        // Дата и время получения задания
        Date startDate = new Date(); // Текущая дата и время

        // Дата и время сдачи задания
        long submissionTimeMillis = System.currentTimeMillis();
        Date submissionDate = new Date(submissionTimeMillis);

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
