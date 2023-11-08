import javax.swing.*;
import java.awt.*;

public class Task3 {
    public Task3() {
        JFrame frame = new JFrame("Password application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField(20);
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        panel.add(serviceLabel);
        panel.add(serviceField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        JButton checkButton = new JButton("Проверить");
        checkButton.addActionListener(e -> {
            String service = serviceField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());



            if (password.equals("секрет")) {
                JOptionPane.showMessageDialog(frame, "Пароль правильный.");
            } else {
                JOptionPane.showMessageDialog(frame, "Пароль неправильный.");
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.add(checkButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task3());
    }
}
