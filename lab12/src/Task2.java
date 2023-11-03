import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Task2 extends JFrame {

    public Task2(BufferedImage image) {
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel imageLabel = new JLabel(new ImageIcon(image));
        add(imageLabel);

        pack(); // Автоматически подгоняет размер окна под размер изображения
        setLocationRelativeTo(null); // Чтобы окно было по центру экрана
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: image.jpg");
            return;
        }

        String imagePath = args[0];

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));

            SwingUtilities.invokeLater(() -> {
                Task2 viewer = new Task2(image);
                viewer.setVisible(true);
            });
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
}