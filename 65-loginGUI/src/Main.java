import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;
    private static JLabel success;
    private static JLabel passwordLabel;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;

    public static void main (String[] args) {

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Submit");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 180, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + " " + password);
        if (user.equals("mos") && password.equals("asdf")) {
            success.setText("Login successfull!!");
        } else {
            System.out.println("Invalid");
        }
    }
}