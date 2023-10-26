package src;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Magazine("Magazine 1"),
                new Book("Book 1"),
                new Magazine("Magazine 2"),
                new Magazine("Magazine 3"),
                new Book("Book 2")
        };

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}