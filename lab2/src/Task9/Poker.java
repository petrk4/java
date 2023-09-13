package Task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int players = 0;
        int kolinkoloda = 5;

        String[] mast = {"Пики" , "Червы", "Бубны", "Крести"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int kolvo = mast.length * cards.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        players = sc.nextInt();

        if (players <= 0) {
            System.out.println("Конец");
        }
        if (kolinkoloda * players >= kolvo) {
            System.out.println("Конец");
        }

        String[] koloda = new String[kolvo];
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < mast.length; j++) {
                koloda[mast.length * i + j] = cards[i] + " " + mast[j];
            }
        }

        for (int i = 0; i < kolvo; i++) {
            int card = i + (int) (Math.random() * (kolvo - i));
            String x = koloda[card];
            koloda[card] = koloda[i];
            koloda[i] = x;
        }

        for (int i = 0; i < players * kolinkoloda; i++) {
            System.out.println(koloda[i]);
            if (i % kolinkoloda == kolinkoloda - 1)
                System.out.println();
        }



    }
}