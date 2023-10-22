public class ShopTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer(Brand.HP, new Processor("Intel i7"), new Memory(16), new Monitor("HP 27f", 27));
        Computer computer2 = new Computer(Brand.Lenovo, new Processor("AMD Ryzen 5"), new Memory(8), new Monitor("Lenovo L24q", 23));
        Computer computer3 = new Computer(Brand.Asus, new Processor("Intel i5"), new Memory(12), new Monitor("Asus VG279Q", 27));

        Shop shop = new Shop();
        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);

        System.out.print("Введите марку компьютера для поиска: ");
        Brand searchBrand = Brand.valueOf(Input.scanner.nextLine());
        Computer foundComputer = shop.findComputerByBrand(searchBrand);

        if (foundComputer != null) {
            System.out.println("Найден компьютер: " + foundComputer);
        } else {
            System.out.println("Компьютер не найден.");
        }
    }
}
