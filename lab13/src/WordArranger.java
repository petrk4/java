import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try {
            List<String> words = readWordsFromFile(fileName);
            String arrangedLine = getLine(words);
            System.out.println("Порядок слов: " + arrangedLine);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Метод для чтения слов из файла
    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordArray = line.split(" ");
                Collections.addAll(words, wordArray);
            }
        }

        return words;
    }

    // Метод для расстановки слов в нужном порядке
    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        List<String> arrangedWords = new ArrayList<>();
        arrangedWords.add(words.remove(0)); // Добавляем первое слово в список

        while (!words.isEmpty()) {
            String lastWord = arrangedWords.get(arrangedWords.size() - 1);
            boolean found = false;

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (lastWord.toLowerCase().charAt(lastWord.length() - 1) == word.toLowerCase().charAt(0)) {
                    arrangedWords.add(word);
                    words.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                break; // Нет подходящего слова, завершаем цикл
            }
        }

        return String.join(" ", arrangedWords);
    }
}
