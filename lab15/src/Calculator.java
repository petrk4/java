import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Калькулятор");

        // Текстовые поля для ввода чисел и вывода результата
        final TextField numField1 = new TextField();
        numField1.setBounds(50, 50, 150, 20);

        final TextField numField2 = new TextField();
        numField2.setBounds(50, 100, 150, 20);

        final TextField resultField = new TextField();
        resultField.setBounds(50, 150, 150, 20);
        resultField.setEditable(false); // Запрет на редактирование поля результата

        // Кнопки для операций
        Button addButton = new Button("+");
        addButton.setBounds(50, 200, 50, 30);

        Button subButton = new Button("-");
        subButton.setBounds(120, 200, 50, 30);

        Button mulButton = new Button("*");
        mulButton.setBounds(190, 200, 50, 30);

        Button divButton = new Button("/");
        divButton.setBounds(260, 200, 50, 30);

        // Обработчик событий для сложения
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Ошибка ввода!");
                }
            }
        });

        // Обработчик событий для вычитания
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Ошибка ввода!");
                }
            }
        });

        // Обработчик событий для умножения
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 * num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Ошибка ввода!");
                }
            }
        });

        // Обработчик событий для деления
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    if (num2 != 0) {
                        double result = num1 / num2;
                        resultField.setText(String.valueOf(result));
                    } else {
                        resultField.setText("Деление на ноль!");
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Ошибка ввода!");
                }
            }
        });

        // Добавление всех элементов на фрейм
        f.add(numField1);
        f.add(numField2);
        f.add(resultField);
        f.add(addButton);
        f.add(subButton);
        f.add(mulButton);
        f.add(divButton);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}