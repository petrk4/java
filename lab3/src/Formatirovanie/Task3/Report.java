package Formatirovanie.Task3;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println(String.format("%-20s %10s", "Имя сотрудника", "Зарплата"));

        Locale locRU = new Locale("ru", "RU");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locRU);

        for (Employee employee : employees) {
            System.out.println(String.format("%-20s %10s", employee.getFullname(), numberFormat.format(employee.getSalary())));
        }
    }

    public static void main (String[] args) {
        Employee employee1 = new Employee("Иван Иванов", 50000);
        Employee employee2 = new Employee("Петр Петров", 60000);
        Employee employee3 = new Employee("Анна Сидорова", 55000);

        Employee[] employees = {employee1, employee2, employee3};

        Report.generateReport(employees);
    }
}
