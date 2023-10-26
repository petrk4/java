package src;

public class StringProcessorTest {
    public static void main(String[] args) {


        StringProcessor stringProcessor = new StringProcessor();

        // Count characters in a string
        String inputString = "Hello, world!";
        int charCount = stringProcessor.countCharacters(inputString);
        System.out.println("Character count in the string: " + charCount);

        // Get characters at odd positions
        String oddPositionChars = stringProcessor.oddPositionChars(inputString);
        System.out.println("Characters at odd positions: " + oddPositionChars);

        // Reverse the string
        String reversedString = stringProcessor.reverseString(inputString);
        System.out.println(

                "Reversed string: " + reversedString);
    }
}