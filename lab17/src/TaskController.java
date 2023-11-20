import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> taskList;
    private TaskView view;

    public TaskController() {
        this.taskList = new ArrayList<>();
        this.view = new TaskView();
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        taskList.add(newTask);
        view.updateTasks(taskList);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < taskList.size()) {
            Task task = taskList.get(index);
            task.setCompleted(true);
            view.updateTasks(taskList);
        }
    }
}
