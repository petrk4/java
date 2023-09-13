package Task4;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> computers = new ArrayList<>();

    public void addComputers() {
        System.out.print("Введите название компьютера: ");
        String pc = scanner.next();
        computers.add(pc);
    }

    public void removeComputers() {
        System.out.print("Введите название компьютера, который хотите удалить: ");
        String pc = scanner.next();

        if (computers.contains(pc)) {
            computers.remove(pc);
            System.out.println("Компьютер был удален.");
        }
        else {
            System.out.println("Компьютер не был найден.");
        }
    }

    public void findComputers() {
        System.out.print("Введите компьютер, который хотите найти: ");
        String pc = scanner.next();

        if (computers.contains(pc)) {
            System.out.println("Компьютер " + (pc) + " был найден.");
        }
        else {
            System.out.println("Компьютер " + (pc) + " не был найден.");
        }
    }

    public void showComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пустой.");
        }
        else {
            for (int i = 0; i < computers.size(); i++) {
                System.out.println("Компютер №" + (i + 1) + " "+ computers.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        while (true) {
            System.out.println("Добавить компьютер - 1");
            System.out.println("Удалить компьютер - 2");
            System.out.println("Найти компьютер - 3");
            System.out.println("Показать все компьютеры - 4");
            System.out.println("Выйти - 5");

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    shop.addComputers();
                    break;

                case 2:
                    shop.removeComputers();
                    break;

                case 3:
                    shop.findComputers();
                    break;

                case 4:
                    shop.showComputers();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }


}