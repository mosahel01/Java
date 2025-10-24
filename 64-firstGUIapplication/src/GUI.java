import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public GUI () {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click Me!");
        label = new JLabel("Number of Clicks: 0");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our first GUI");
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed (ActionEvent e) {
        count++;
        label.setText("Number of Clicks : " + count);
    }

    public static void main (String[] args) {
        new GUI();
    }
}
