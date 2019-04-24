package View;

import Test.AddNewFollowers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame2 {

    public static JTextField userText = new JTextField(20);
    public static JPasswordField passwordText = new JPasswordField(20);
    public static JButton loginButton = new JButton("login");
    public static JFrame frame = new JFrame("Demo application");


    public static void main(String[] args) {
        frame = new JFrame("Demo application");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new TestActionListener());

        JButton registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);
    }

    public static class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            loginButton = (JButton)e.getSource();
            frame.dispose();
            AddNewFollowers addNewFollowers = new AddNewFollowers();
            addNewFollowers.setup();
            try {
                addNewFollowers.Test();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }

}