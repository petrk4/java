package src;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Magazines:");
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                ((Magazine) item).print();
            }
        }
    }
}