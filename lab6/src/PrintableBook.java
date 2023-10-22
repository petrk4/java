public class PrintableBook implements Printable {
    private String title;

    public PrintableBook(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing book: " + title);
    }
}
