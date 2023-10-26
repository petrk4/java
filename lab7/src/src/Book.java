package src;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Books:");
        for (Printable item : printable) {
            if (item instanceof Book) {
                ((Book) item).print();
            }
        }
    }
}