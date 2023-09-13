package Task7;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("J.R.R. Tolkien", "The fellowship of the ring", 1995);
        Book b2 = new Book("Jane Austen", "Pride and prejudice", 1796);

        b1.setName("TestName");
        System.out.println("Name 1th book (update) - " + b1.getName());

        b2.setYear(9999);
        System.out.println("Year 2nd book (update) - " + b2.getYear());
    }
}