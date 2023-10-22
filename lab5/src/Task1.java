import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Task1 {
    private static int milan = 0;
    private static int madrid = 0;
    private static JLabel result;
    private static JLabel lastScorer;
    private static JLabel winner;
    public static void main(String args[]) {
        JFrame frame = new JFrame("Madrid vs Milan");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        JButton milanBtn = new JButton("AC Milan");
        JButton madridBtn = new JButton("Real Madrid");

        result = new JLabel("Result: 0 X 0");
        lastScorer = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");

        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                lastScorer.setText("Last Scorer: AC Milan");
                updateResult();
            }
        });

        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                lastScorer.setText("Last Scorer: Real Madrid");
                updateResult();
            }
        });

        frame.add(milanBtn);
        frame.add(madridBtn);
        frame.add(result);
        frame.add(lastScorer);
        frame.add(winner);

        frame.setVisible(true);
    }

    private static void updateResult() {
        result.setText("Result: " + milan + " x " + madrid);

        if (milan > madrid) {
            winner.setText("Winner: AC Milan");
        } else if (milan < madrid) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
}
