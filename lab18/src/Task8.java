import java.util.Scanner;

public class Task8 {
    public void getKey() {
        boolean inputValid = false;
        Scanner myScanner = new Scanner(System.in);

        while (!inputValid) {
            System.out.print("Enter a key: ");
            String key = myScanner.next();
            try {
                printDetails(key);
                inputValid = true; // Если нет исключения, то ввод корректен
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        Task8 demo = new Task8();
        demo.getKey();
    }
}
