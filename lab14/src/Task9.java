import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
        String text = "This is a sample text for building a letter frequency dictionary. It can be any text you choose.";

        // Приведем все буквы к нижнему регистру, чтобы учитывать регистронезависимую частоту
        text = text.toLowerCase();

        // Создадим карту для хранения частоты букв
        Map<Character, Integer> letterFrequency = new HashMap<>();

        // Перебираем символы в тексте
        for (char c : text.toCharArray()) {
            // Проверяем, является ли символ буквой
            if (Character.isLetter(c)) {
                // Увеличиваем частоту данной буквы в карте
                letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Выводим результаты
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
