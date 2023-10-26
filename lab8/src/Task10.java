public class Task10 {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverse(n);
        System.out.println("Развернутое число: " + reversed);
    }

    public static int reverse(int n) {
        if (n < 10) {
            // Базовый случай: если число состоит из одной цифры, возвращаем его
            return n;
        } else {
            // Разделяем число на последнюю цифру (единицы) и оставшиеся цифры
            int lastDigit = n % 10;
            int remainingDigits = n / 10;

            // Рекурсивно разворачиваем оставшиеся цифры
            int reversedRemaining = reverse(remainingDigits);

            // Собираем результат, добавляя последнюю цифру в конец развернутой последовательности
            return Integer.parseInt(reversedRemaining + "" + lastDigit);
        }
    }
}
