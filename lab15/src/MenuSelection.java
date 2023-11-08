import javax.swing.*;
import java.awt.event.*;

public class MenuSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор меню");

        // Создание массива названий стран
        String[] countries = {"Australia", "China", "England", "Russia"};

        // Создание выпадающего списка
        JComboBox<String> countryList = new JComboBox<>(countries);
        countryList.setBounds(50, 50, 100, 30);

        // Создание текстовой области для вывода информации о стране
        JTextArea infoArea = new JTextArea();
        infoArea.setBounds(50, 100, 200, 100);
        infoArea.setEditable(false);

        // Обработчик выбора элемента из списка
        countryList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryList.getSelectedItem();
                // Вывод информации о выбранной стране
                displayCountryInfo(selectedCountry, infoArea);
            }
        });

        // Добавление элементов на фрейм
        frame.add(countryList);
        frame.add(infoArea);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Метод для вывода информации о стране
    public static void displayCountryInfo(String country, JTextArea infoArea) {
        // Информация о странах (можно расширить)
        String countryInfo = "";
        switch (country) {
            case "Australia":
                countryInfo = "Столица - Канберра";
                break;
            case "China":
                countryInfo = "Столица - Пекин";
                break;
            case "England":
                countryInfo = "Столица - Лондон";
                break;
            case "Russia":
                countryInfo = "Столица - Москва";
                break;
            default:
                countryInfo = "Нет информации";
                break;
        }
        infoArea.setText(countryInfo);
    }
}