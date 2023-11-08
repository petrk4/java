import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public Task2() {
        setTitle("Пример JTextArea с меню");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        textArea = new JTextArea(10, 40);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        createMenus();

        pack();
        setLocationRelativeTo(null);
    }

    private void createMenus() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);

        JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        colorMenu.add(blueItem);

        JMenuItem redItem = new JMenuItem("Красный");
        redItem.addActionListener(new ColorActionListener(Color.RED));
        colorMenu.add(redItem);

        JMenuItem blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));
        colorMenu.add(blackItem);

        fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        fontMenu.add(timesNewRomanItem);

        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        fontMenu.add(msSansSerifItem);

        JMenuItem courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(new FontActionListener("Courier New"));
        fontMenu.add(courierNewItem);
    }

    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
            textArea.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task2 app = new Task2();
            app.setVisible(true);
        });
    }
}
