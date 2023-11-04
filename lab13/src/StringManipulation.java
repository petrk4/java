public class StringManipulation {
    public static void main(String[] args) {
        // Задание 1: Создаем строку
        String inputString = "I like Java!!!";

        // Задание 2: Распечатываем последний символ
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // Задание 3: Проверяем, заканчивается ли строка "!!!".
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли строка '!!!': " + endsWithExclamation);

        // Задание 4: Проверяем, начинается ли строка с "I like".
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли строка с 'I like': " + startsWithILike);

        // Задание 5: Проверяем, содержит ли строка "Java".
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // Задание 6: Находим позицию подстроки "Java".
        int javaPosition = inputString.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaPosition);

        // Задание 7: Заменяем все символы 'а' на 'о'.
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // Задание 8: Преобразуем строку к верхнему регистру.
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + uppercaseString);

        // Задание 9: Преобразуем строку к нижнему регистру.
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowercaseString);

        // Задание 10: Вырезаем подстроку "Java".
        String substringJava = inputString.substring(7, 11); // Индексы 7 и 11 задают диапазон
        System.out.println("Вырезанная подстрока 'Java': " + substringJava);
    }
}
