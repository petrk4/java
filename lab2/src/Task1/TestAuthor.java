package Task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Max", "kk33@gmail.com", 'm');

        System.out.println("Name: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender: " + a1.getGender());

        a1.setEmail("kk44@gmail.com");

        System.out.println("New email: " + a1.getEmail());

        System.out.println("Info: " + a1.toString());

    }
}