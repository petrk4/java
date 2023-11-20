import java.util.InputMismatchException;
import java.util.Scanner;

/*public class Task2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}*/

public class Task2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (InputMismatchException e) {
            System.out.println("Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}

/*
Если ввести "Qwerty", программа выбросит java.util.InputMismatchException, так как "Qwerty" не является целым числом.
*/
