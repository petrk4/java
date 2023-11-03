import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private int age;
    private LocalDate birthDate; // Используем LocalDate вместо Date

    public Student(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFormattedBirthDate(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return birthDate.format(formatter);
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age + "\nДата рождения: " + getFormattedBirthDate("dd.MM.yyyy");
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 5, 15); // Создаем LocalDate с правильной датой
        Student student = new Student("Иван", 21, birthDate);

        System.out.println(student);
        System.out.println("Дата рождения в полном формате: " + student.getFormattedBirthDate("dd MMMM yyyy"));
        System.out.println("Дата рождения в коротком формате: " + student.getFormattedBirthDate("dd.MM.yy"));
    }
}