package src;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 5, 0, 5);
        System.out.println("Original Rectangle: " + rectangle);

        rectangle.moveUp();
        System.out.println("After moving up: " + rectangle);

        rectangle.moveLeft();
        System.out.println("After moving left: " + rectangle);

        rectangle.moveDown();
        System.out.println("After moving down: " + rectangle);

        rectangle.moveRight();
        System.out.println("After moving right: " + rectangle);

        System.out.println("Speed test: " + rectangle.speedTest());
    }
}