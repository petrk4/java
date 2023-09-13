package Task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");

        String s = sc.nextLine();

        String[] words = s.split(" ");

        System.out.println("Кол-во слов: " + words.length);
    }
}