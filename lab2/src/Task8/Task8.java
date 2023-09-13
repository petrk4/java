package Task8;

public class Task8 {
    public static void main (String[] args) {
        String[] mas = {"na", "pa", "da", "ga"};

        int size = mas.length;

        for (int i = 0; i < size / 2; i++) {
            String n = mas[i];
            mas[i] = mas[size - 1 - i];
            mas[size - 1 - i] = n;
        }

        for (String i : mas) {
            System.out.print(i + " ");
        }
    }
}