package Task6;

public class TestCircle {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(2.1);
        Circle2 c2 = new Circle2(3.1);

        System.out.println("1th circle: area - " + c1.area() + ", length - " + c1.length());
        System.out.println("2nd circle: area - " + c2.area() + ", length - " + c2.length());

        if (c1.equals(c2)) {
            System.out.println("1th circle = 2nd circle");
        }
        else {
            System.out.println("1th circle != 2nd circle");
        }
    }
}