import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

// Модель (Model)
class CalculatorModel {
    private double result;
    private StringBuilder currentInput;
    private StringBuilder expression;
    private Stack<Object> stack;  // Обновлено: использование Object для хранения чисел и операторов
    private CalculatorView view;

    public CalculatorModel(CalculatorView view) {
        result = 0;
        currentInput = new StringBuilder();
        expression = new StringBuilder();
        stack = new Stack<>();
        this.view = view;
    }

    public void appendToken(String token) {
        if (token.matches("[0-9]+")) {
            currentInput.append(token);
            expression.append(token).append(" ");
        } else if (token.matches("[+\\-*/]")) {
            while (!stack.isEmpty() && stack.peek() instanceof String &&
                    getPrecedence((String) stack.peek()) >= getPrecedence(token)) {
                expression.append(stack.pop()).append(" ");
            }
            stack.push(Double.parseDouble(currentInput.toString()));
            currentInput.setLength(0);
            stack.push(token);
            expression.append(token).append(" ");
        } else if (token.equals("=")) {
            while (!stack.isEmpty()) {
                expression.append(stack.pop()).append(" ");
            }
            calculateExpression();
        }
        updateExpressionDisplay();
    }

    private void calculateExpression() {
        stack.clear();  // Очищаем стек перед вычислением нового выражения

        String[] tokens = expression.toString().split(" ");
        for (String t : tokens) {
            if (t.matches("[0-9]+")) {
                stack.push(Double.parseDouble(t));
            } else if (t.matches("[+\\-*/]")) {
                while (stack.size() >= 2 && stack.peek() instanceof Double) {
                    double operand2 = (double) stack.pop();
                    double operand1 = (double) stack.pop();
                    switch (t) {
                        case "+":
                            stack.push(operand1 + operand2);
                            break;
                        case "-":
                            stack.push(operand1 - operand2);
                            break;
                        case "*":
                            stack.push(operand1 * operand2);
                            break;
                        case "/":
                            if (operand2 != 0) {
                                stack.push(operand1 / operand2);
                            } else {
                                // Обработка деления на ноль
                                System.out.println("Error: Division by zero");
                            }
                            break;
                    }
                }
            }
        }

        if (!stack.isEmpty() && stack.peek() instanceof Double) {
            result = (double) stack.pop();
        }

        updateResultDisplay();
    }

    private int getPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return expression.toString();
    }

    private void updateExpressionDisplay() {
        SwingUtilities.invokeLater(() -> view.updateExpressionDisplay(getExpression()));
    }

    private void updateResultDisplay() {
        SwingUtilities.invokeLater(() -> view.updateResultDisplay(Double.toString(getResult())));
    }
}

// Представление (View)
class CalculatorView {
    private JFrame frame;
    private JTextField expressionDisplay;
    private JTextField resultDisplay;

    public CalculatorView() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        expressionDisplay = new JTextField();
        expressionDisplay.setEditable(false);
        frame.add(expressionDisplay, BorderLayout.NORTH);

        resultDisplay = new JTextField();
        resultDisplay.setEditable(false);
        frame.add(resultDisplay, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};

        CalculatorController controller = new CalculatorController(this);

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(controller);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void updateExpressionDisplay(String expression) {
        expressionDisplay.setText(expression);
    }

    public void updateResultDisplay(String result) {
        resultDisplay.setText(result);
    }
}

// Контроллер (Controller)
class CalculatorController implements ActionListener {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorView view) {
        this.model = new CalculatorModel(view);
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonText = source.getText();

        model.appendToken(buttonText);
    }
}

// Главный класс
public class CalculatorGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorView view = new CalculatorView();
            new CalculatorController(view);
        });
    }
}
