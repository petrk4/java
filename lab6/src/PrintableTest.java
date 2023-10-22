public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new PrintableBook("The Great Gatsby");
        printableItems[1] = new PrintableShop("Bookstore");
        printableItems[2] = new PrintableBook("To Kill a Mockingbird");

        for (Printable item : printableItems) {
            item.print();
        }
    }
}
