public class MVCPatternDemo2 {
    public static void main(String[] args) {
        TaskController controller = new TaskController();

        // Добавление задач в список
        controller.addTask("Подготовить отчёт");
        controller.addTask("Сходить в магазин");

        // Пометить первую задачу как выполненную
        controller.markTaskAsCompleted(0);
    }
}
