// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 2: 
// Write a program using JPasswordField to set the password character as "#" instead of "*"!

import javax.swing.*;
import java.awt.*;

public class PracticalNo_12Q2 extends JFrame {
    private CustomPasswordField passwordField;
    private JLabel resultLabel;

    public PracticalNo_12Q2() {
        setTitle("Custom Password Character Application By Harsh Kale!!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        passwordField = new CustomPasswordField(20, '#'); // Set '#' as the custom echo character
        resultLabel = new JLabel("Password: ");

        panel.add(passwordField);
        panel.add(resultLabel);

        getContentPane().add(panel, BorderLayout.CENTER);

        // Add an ActionListener to display the password
        passwordField.addActionListener(e -> displayPassword());
    }

    private void displayPassword() {
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        resultLabel.setText("Password: " + password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Developer Harsh Kale!!");
            PracticalNo_12Q2 app = new PracticalNo_12Q2();
            app.setVisible(true);
        });
    }
}

class CustomPasswordField extends JPasswordField {
    private char customEchoChar;
    
    public CustomPasswordField(int columns, char customEchoChar) {
        super(columns);
        this.customEchoChar = customEchoChar;
    }
    
    @Override
    public char getEchoChar() {
        System.out.println("Developer Harsh Moreshwar Kale!!");
        return customEchoChar;
    }
}


