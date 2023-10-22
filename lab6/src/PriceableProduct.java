public class PriceableProduct implements Priceable {
    private String name;
    private double price;

    public PriceableProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
