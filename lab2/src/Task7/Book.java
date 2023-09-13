package Task7;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}