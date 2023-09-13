package Task3;

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

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println("Task3.Circle " + (i + 1) + ": center - " + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + "; radius - " + circles[i].getRadius());
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1.3, 2.7);
        Circle c1 = new Circle(p1, 6.0);

        Point p2 = new Point(1.9, 2.0);
        Circle c2 = new Circle(p2, 7.2);

        Tester tester = new Tester(2);

        tester.fillCircle(c1);
        tester.fillCircle(c2);

        tester.printArray();
    }
}