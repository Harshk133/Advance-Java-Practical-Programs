// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 3: 
// Write a Program using JPasswordField and JTextField to demonstrate the use of user authentication.!



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_12Q3 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public PracticalNo_12Q3() {
        setTitle("User Authentication Application By Harsh Kale!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                authenticateUser();
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty space
        panel.add(loginButton);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void authenticateUser() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Replace this with your actual authentication logic
        if ("Harsh Kale".equals(username) && "psw".equals(password)) {
            JOptionPane.showMessageDialog(this, "Authentication Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Authentication Failed. Please try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!!");
                PracticalNo_12Q3 app = new PracticalNo_12Q3();
                app.setVisible(true);
            }
        });
    }
}

