import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать! Пожалуйста, введите ФИО:");
        String fullName = scanner.nextLine();

        System.out.println("Теперь введите номер ИНН:");
        String innNumber = scanner.nextLine();

        try {
            if (isValidINN(innNumber)) {
                System.out.println("Заказ успешно оформлен для " + fullName);
                // Здесь можно добавить логику для оформления заказа
            } else {
                throw new Exception("Введен недействительный ИНН!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для проверки валидности ИНН
    public static boolean isValidINN(String inn) {
        if (inn.length() != 12) {
            return false;
        }

        try {
            long num = Long.parseLong(inn);
            int[] innArray = inn.chars().map(Character::getNumericValue).toArray();

            int checkDigit = 0;

            // Проверка контрольной суммы
            for (int i = 0; i < 10; i++) {
                checkDigit += innArray[i] * (i % 2 == 0 ? (i < 5 ? 2 : 1) : 7);
            }

            checkDigit = checkDigit % 11 % 10;

            return checkDigit == innArray[10];
        } catch (NumberFormatException e) {
            return false;
        }
    }
}