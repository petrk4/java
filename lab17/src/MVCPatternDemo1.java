public class MVCPatternDemo1 {
    public static void main(String[] args) {
        // Инициализация модели, представления и контроллера
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Обновление данных и вывод информации о сотруднике
        controller.setEmployeeName("Андрей Пакетов");
        controller.setEmployeeHourlyRate(20);
        controller.setEmployeeHoursWorked(40);
        controller.updateView();
    }
}
