import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        String expression = textField.getText();
                        try {
                            double result = evaluateExpression(expression);
                            textField.setText(String.valueOf(result));
                        } catch (ArithmeticException | IllegalArgumentException ex) {
                            textField.setText("Error");
                        }
                    } else {
                        textField.setText(textField.getText() + command);
                    }
                }
            });
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) throws ArithmeticException, IllegalArgumentException {
        char operator = 0;
        double result = 0;

        if (expression.contains("+")) {
            operator = '+';
        } else if (expression.contains("-")) {
            operator = '-';
        } else if (expression.contains("*")) {
            operator = '*';
        } else if (expression.contains("/")) {
            operator = '/';
        }

        String[] operands = expression.split("[+\\-*/]");
        double num1 = Double.parseDouble(operands[0]);
        double num2 = Double.parseDouble(operands[1]);

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid expression");
        }

        return result;
    }
}