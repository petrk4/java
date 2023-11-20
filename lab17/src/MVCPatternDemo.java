public class MVCPatternDemo {
    public static void main(String[] args) {
        // Инициализация модели, вид и контроллера
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновление данных и вывод на экран
        controller.updateView();

        // Обновление имени и номера студента и вывод на экран
        controller.setStudentName("John");
        controller.setStudentRollNo("12345");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        // Предположим, что здесь происходит получение данных о студенте из базы данных
        // Создаем и возвращаем объект Student для демонстрации
        Student student = new Student();
        student.setName("Андрей Пакетов");
        student.setRollNo("54321");
        return student;
    }
}
