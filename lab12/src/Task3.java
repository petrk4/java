import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.Thread;

public class Task3 extends JPanel implements Runnable {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int FRAME_RATE = 30; // Скорость анимации (кадры в секунду)

    private BufferedImage[] frames; // Массив кадров
    private int currentFrame = 0; // Индекс текущего кадра
    private Thread animationThread;
    private boolean running = false;

    public Task3() {
        frames = new BufferedImage[4]; // Пример: 4 кадра анимации

        for (int i = 0; i < frames.length; i++) {
            frames[i] = createFrame(i); // Создаем кадры анимации
        }

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private BufferedImage createFrame(int frameNumber) {
        BufferedImage frame = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = frame.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLUE);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("Frame " + frameNumber, 100, 100);
        g2d.dispose();
        return frame;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames[currentFrame] != null) {
            g.drawImage(frames[currentFrame], 0, 0, this);
        }
    }

    @Override
    public void run() {

        while (running) {

            // Обновляем текущий кадр
            repaint();
            currentFrame = (currentFrame + 1) % frames.length;
        }
    }

    public void startAnimation() {
        if (animationThread == null) {
            running = true;
            animationThread = new Thread(this);
            animationThread.start();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        Task3 animation = new Task3();
        frame.add(animation);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Запускаем анимацию
        animation.startAnimation();
    }
}
