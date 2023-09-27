// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 1: 
// Write a program to demonstrate the use of JTextField and JPasswordField using listener interface.
// Note 👉 I am using the `swing` because awt not working on my machine for that purpose I use Swing instead of applet! 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PracticalNo_12Q1 extends JFrame {
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel textFieldLabel, passwordFieldLabel;

    public PracticalNo_12Q1() {
        setTitle("Text Field & Password Field Application By Harsh Kale!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2));

        textFieldLabel = new JLabel("Text Field:");
        textField = new JTextField(20);
        textFieldLabel.setLabelFor(textField);

        passwordFieldLabel = new JLabel("Password Field:");
        passwordField = new JPasswordField(20);
        passwordFieldLabel.setLabelFor(passwordField);

        panel.add(textFieldLabel);
        panel.add(textField);
        panel.add(passwordFieldLabel);
        panel.add(passwordField);

        getContentPane().add(panel, BorderLayout.CENTER);

        // Add ActionListener to the text field
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleTextFieldAction();
            }
        });

        // Add KeyListener to the password field
        passwordField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {}

            public void keyReleased(KeyEvent e) {
                handlePasswordFieldKeyReleased(e);
            }
        });
    }

    private void handleTextFieldAction() {
        String text = textField.getText();
        JOptionPane.showMessageDialog(this, "Text Field Action: " + text);
    }

    private void handlePasswordFieldKeyReleased(KeyEvent e) {
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        JOptionPane.showMessageDialog(this, "Password Field Key Released: " + password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!!");
                PracticalNo_12Q1 app = new PracticalNo_12Q1();
                app.setVisible(true);
            }
        });
    }
}

