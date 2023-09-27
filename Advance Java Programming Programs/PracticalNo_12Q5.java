// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 5: 
// Write a Program using JPasswordField to accept password from user and if the length is less than 6 characters then error message should be displayed "Password lenght must be greater than 6 characters!!"

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PracticalNo_12Q5 extends JFrame {
    private JPasswordField passwordField;
    private JLabel resultLabel;

    public PracticalNo_12Q5() {
        setTitle("Password Validation Program By Harsh Kale!!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        passwordField = new JPasswordField(20);
        resultLabel = new JLabel();

        panel.add(passwordField);
        panel.add(resultLabel);

        getContentPane().add(panel, BorderLayout.CENTER);

        // Add a KeyListener to the password field
        passwordField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {}

            public void keyReleased(KeyEvent e) {
                validatePassword();
            }
        });
    }

    private void validatePassword() {
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (password.length() < 6) {
            resultLabel.setText("Password length must be greater than 6 characters!!");
        } else {
            resultLabel.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!!");
                PracticalNo_12Q5 app = new PracticalNo_12Q5();
                app.setVisible(true);
            }
        });
    }
}

