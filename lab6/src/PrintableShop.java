public class PrintableShop implements Printable {
    private String shopName;

    public PrintableShop(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void print() {
        System.out.println("Printing shop: " + shopName);
    }
}
