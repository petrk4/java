package Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(1.2, 3.4);

        System.out.println("X: " + b1.getX() + " , Y: " + b1.getY());
        System.out.println("X: " + b2.getX() + " , Y: " + b2.getY());

        b1.setX(2.0);
        b1.setY(4.1);
        b2.setXY(1.0, 2.3);

        System.out.println("New X: " + b1.getX() + " , new Y: " + b1.getY());
        System.out.println("New X: " + b2.getX() + " , new Y: " + b2.getY());

        b1.move(1.0, 3.0);

        System.out.println("Move X: " + b1.getX() + " , move Y: " + b1.getY());

        System.out.println("Itog: " + b1.toString());
        System.out.println("Itog: " + b2.toString());
    }
}