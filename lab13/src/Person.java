public class Person {
    private String surname;
    private String name;
    private String lastname;

    // Конструктор класса
    public Person(String surname, String name, String lastname) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
    }

    // Функция для получения Фамилии И.О.
    public String GetFullName() {
        StringBuilder FullName = new StringBuilder(surname);

        if (name != null && !name.isEmpty()) {
            FullName.append(" ").append(name.charAt(0)).append(".");
        }

        if (lastname != null && !lastname.isEmpty()) {
            FullName.append(" ").append(lastname.charAt(0)).append(".");
        }

        return FullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Зубенко", "Михаил", "Петрович");

        System.out.println("ФИО person1: " + person1.GetFullName());
        System.out.println("ФИО person2: " + person2.GetFullName());
    }
}