package Task2;

public class Circle {
    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Окружность с центрм - " + getCenter().toString() + " и радиусом " + radius;
    }
}
