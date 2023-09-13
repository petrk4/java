package Task7;

public class BookShelf {
    private Book[] books;
    private int countBook;

    public BookShelf(int size) {
        books = new Book[size];
        countBook = 0;
    }

    public void addBook(Book book) {
        if (countBook < books.length) {
            books[countBook] = book;
            countBook++;
        }
        else {
            System.out.println("Bookshelf full");
        }
    }

    public Book earBook() {
        if (countBook == 0) {
            return null;
        }

        Book min = books[0];
        for (int i = 0; i < countBook; i++) {
            if (books[i].getYear() < min.getYear()) {
                min = books[i];
            }
        }

        return min;
    }

    public Book lsBook() {
        if (countBook == 0) {
            return null;
        }

        Book max = books[0];
        for (int i = 0; i < countBook; i++) {
            if (books[i].getYear() > max.getYear()) {
                max = books[i];
            }
        }

        return max;
    }

    public void sortYear() {
        for (int i = 0; i < countBook - 1; i++) {
            for (int j = 0; j < countBook - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book x = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.addBook(new Book("Book1", "Author1", 1991));
        bookShelf.addBook(new Book("Book2", "Author2", 2041));
        bookShelf.addBook(new Book("Book3", "Author3", 1746));
        bookShelf.addBook(new Book("Book4", "Author4", 2020));

        Book ea = bookShelf.earBook();
        System.out.println("Earliest book: " + ea.getName() + " " + ea.getAuthor() + " " + ea.getYear());

        Book ls = bookShelf.lsBook();
        System.out.println("Latest book: " + ls.getName() + " " + ls.getAuthor() + " " + ls.getYear());

        bookShelf.sortYear();
        for (Book book : bookShelf.books) {
            System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        }
    }


}