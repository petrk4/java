import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Конструктор класса Address
    public Address(String addressString) {
        // Разделяем строку по запятой и записываем в соответствующие поля
        String[] parts = addressString.split(",");
        if (parts.length >= 1) country = parts[0].trim();
        if (parts.length >= 2) region = parts[1].trim();
        if (parts.length >= 3) city = parts[2].trim();
        if (parts.length >= 4) street = parts[3].trim();
        if (parts.length >= 5) house = parts[4].trim();
        if (parts.length >= 6) building = parts[5].trim();
        if (parts.length >= 7) apartment = parts[6].trim();
    }

    // Конструктор класса Address с использованием StringTokenizer
    public Address(String addressString, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, delimiter);
        if (tokenizer.hasMoreTokens()) country = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) region = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) city = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) street = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) house = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) building = tokenizer.nextToken().trim();
        if (tokenizer.hasMoreTokens()) apartment = tokenizer.nextToken().trim();
    }

    // Геттеры для полей адреса

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    public static void main(String[] args) {
        // Примеры адресных строк с разными разделителями
        String addressString1 = "Россия, Московская область, Москва, Пресненская наб., 1, 2, 3";
        String addressString2 = "США. Калифорния. Лос-Анджелес. Санта-Моника. 123. 45. 67";
        String addressString3 = "Франция; Париж; Шам-Элизе; 5; ; ";
        String addressString4 = "Канада. Альберта; Калгари. Улица, 42, , ";

        // Создаем объекты Address с использованием split()
        Address address1 = new Address(addressString1);
        Address address2 = new Address(addressString2);
        Address address3 = new Address(addressString3, ";");
        Address address4 = new Address(addressString4, ".");

        // Выводим информацию о адресах
        System.out.println("Адрес 1:");
        System.out.println("Страна: " + address1.getCountry());
        System.out.println("Регион: " + address1.getRegion());
        System.out.println("Город: " + address1.getCity());
        System.out.println("Улица: " + address1.getStreet());
        System.out.println("Дом: " + address1.getHouse());
        System.out.println("Корпус: " + address1.getBuilding());
        System.out.println("Квартира: " + address1.getApartment());

        // Повторяем для остальных адресов...
    }
}
