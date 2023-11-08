import javax.swing.*;
import java.awt.*;

public class MenuProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Программа с меню");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Панель с кнопками
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        frame.add(buttonPanel, BorderLayout.NORTH);

        // Поле для текста
        JTextArea textArea = new JTextArea();
        frame.add(textArea, BorderLayout.CENTER);

        // Создание меню
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        JMenu helpMenu = new JMenu("Справка");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
