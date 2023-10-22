public class PriceableTest {
    public static void main(String[] args) {
        Priceable laptop = new PriceableProduct("Laptop", 999.99);
        Priceable plumbingService = new PriceableService("Plumbing", 75.0, 2);

        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Price: $" + plumbingService.getPrice());
    }
}
