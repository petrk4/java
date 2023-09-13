package Task6;

public class Circle2 {
    private double r;

    public Circle2(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR (double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double length() {
        return 2 * Math.PI * r;
    }

    public boolean equals(Circle2 circle) {
        return this.r == circle.r;
    }



}