package src;

public class StringProcessor implements StringOperations {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}