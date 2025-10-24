import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void ArrowKeys () {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel("Up");
        JLabel down = new JLabel("Down");
        JLabel left = new JLabel("Left");
        JLabel right = new JLabel("Right");

        frame.addKeyListener(new KeyListener() {

            int upClick = 0;
            int downClick = 0;
            int leftClick = 0;
            int rightClick = 0;

            @Override
            public void keyTyped (KeyEvent e) {
            }

            @Override
            public void keyPressed (KeyEvent e) {
                int keyCode = e.getKeyCode();
                // switch (keyCode) {
                //     case 38 -> System.out.println("Up");
                //     case 40 -> System.out.println("Down");
                //     case 37 -> System.out.println("Left");
                //     case 39 -> System.out.println("Right");
                // }
                switch (keyCode) {
                    case KeyEvent.VK_UP -> up.setText("Up: " + Integer.toString(++ upClick));
                    case KeyEvent.VK_DOWN -> down.setText("Down: " + Integer.toString(++ downClick));
                    case KeyEvent.VK_LEFT -> left.setText("Left: " + Integer.toString(++ leftClick));
                    case KeyEvent.VK_RIGHT -> right.setText("Right: " + Integer.toString(++ rightClick));
                }
            }

            @Override
            public void keyReleased (KeyEvent e) {
            }
        });

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        frame.add(panel);

    }

    public static void main (String[] args) {
        ArrowKeys();
    }
}