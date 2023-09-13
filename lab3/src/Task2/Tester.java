package Task2;

import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }
    public void fillCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
        else {
            System.out.println("Array is full");
        }
    }

    public Circle smallCircle() {
        Circle min = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < min.getRadius()) {
                min = circles[i];
            }
        }
        return min;
    }

    public Circle bigCircle() {
        Circle max = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > max.getRadius()) {
                max = circles[i];
            }
        }
        return max;
    }

    public void sortCircles() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle x = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Tester tester = new Tester(10);

        for (int i = 0; i < 10; i++) {
            Point point = new Point(random.nextDouble(), random.nextDouble());
            Circle circle = new Circle(point, random.nextDouble());
            tester.fillCircle(circle);
        }

        Circle small = tester.smallCircle();
        System.out.println("Самая маленькая окружность: " + small.toString());
        Circle big = tester.bigCircle();
        System.out.println("Самая большая окружность: " + big.toString());

        tester.sortCircles();
        System.out.println("Отсортированный массив: ");

        for (int i = 0; i < tester.count; i++) {
            Circle circle = tester.circles[i];
            System.out.println(circle.toString());
        }
    }


}
