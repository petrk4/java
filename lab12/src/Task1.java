import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    private Color color;
    private int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Абстрактный метод для отрисовки фигуры
    public abstract void draw(Graphics g);
}

// Класс для прямоугольника
class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}

// Класс для овала
class OvalShape extends Shape {
    private int width, height;

    public OvalShape(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), width, height);
    }
}

public class  Task1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(300);
                    int y = random.nextInt(300);
                    int width = random.nextInt(100);
                    int height = random.nextInt(100);
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                    if (i % 2 == 0) {
                        RectangleShape rectangle = new RectangleShape(color, x, y, width, height);
                        rectangle.draw(g);
                    } else {
                        OvalShape oval = new OvalShape(color, x, y, width, height);
                        oval.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
