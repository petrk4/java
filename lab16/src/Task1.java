import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Task1 extends JFrame {
    private int numberToGuess;
    private int attemptsLeft = 3;

    public Task1() {
        setTitle("Угадай число");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Угадай число между 0 и 20:");
        add(label, BorderLayout.NORTH);

        JTextField textField = new JTextField(10);
        add(textField, BorderLayout.CENTER);

        JButton button = new JButton("Проверить");
        add(button, BorderLayout.SOUTH);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage("Добро пожаловать в САО");
            }
        });

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage("Добро пожаловать в ЦАО");
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage("Добро пожаловать в ЗАО");
            }
        });

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage("Добро пожаловать в ЮАО");
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage("Добро пожаловать в ВАО");
            }
        });

        numberToGuess = new Random().nextInt(21);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(textField.getText());
                    checkGuess(guess);
                } catch (NumberFormatException ex) {
                    showMessage("Введите корректное число!");
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void checkGuess(int guess) {
        if (attemptsLeft > 0) {
            if (guess == numberToGuess) {
                showMessage("Поздравляем, вы угадали!");
                dispose();
            } else if (guess < numberToGuess) {
                showMessage("Число больше. Попыток осталось: " + (--attemptsLeft));
            } else {
                showMessage("Число меньше. Попыток осталось: " + (--attemptsLeft));
            }
        } else {
            showMessage("Вы исчерпали все попытки. Загаданное число: " + numberToGuess);
            dispose();
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task1 game = new Task1();
            game.setVisible(true);
        });
    }
}
