import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TaskView {
    private JFrame frame;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;

    public TaskView() {
        frame = new JFrame("To-Do List");
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(taskList);
        frame.add(scrollPane);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public void updateTasks(List<Task> tasks) {
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isCompleted() ? " (Completed)" : ""));
        }
    }
}
