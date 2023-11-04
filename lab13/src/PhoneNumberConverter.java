import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberConverter {
    public static String convertPhoneNumber(String phoneNumber) {
        // Удалить все символы, кроме цифр
        phoneNumber = phoneNumber.replaceAll("[^\\d]", "");

        // Проверка на правильную длину номера
        if (phoneNumber.length() != 11 && phoneNumber.length() != 10) {
            return "Некорректная длина номера";
        }

        // Если номер начинается с "8", добавить "+7" в начало
        if (phoneNumber.startsWith("8")) {
            phoneNumber = "+7" + phoneNumber.substring(1);
        }

        // Форматирование номера: +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
        Pattern pattern = Pattern.compile("(\\+\\d{1,3})(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            return matcher.group(1) + "-" + matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4);
        } else {
            return "Некорректный формат номера";
        }
    }

    public static void main(String[] args) {
        // Примеры строковых представлений номеров
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        // Преобразование и вывод на консоль
        System.out.println("Преобразованный номер 1: " + convertPhoneNumber(phoneNumber1));
        System.out.println("Преобразованный номер 2: " + convertPhoneNumber(phoneNumber2));
        System.out.println("Преобразованный номер 3: " + convertPhoneNumber(phoneNumber3));
    }
}
