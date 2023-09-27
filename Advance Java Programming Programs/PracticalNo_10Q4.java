// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 4: 
// Develop a program to accept two numbers and display product of two numbers when user pressed "Multiply" Button.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticalNo_10Q4 extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton multiplyButton;
    private JLabel resultLabel;

    public PracticalNo_10Q4() {
        setTitle("Multiplication App By Harsh Kale");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel num1Label = new JLabel("Enter Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2Field = new JTextField(10);

        resultLabel = new JLabel("Result: ");

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateProduct();
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(multiplyButton);
        panel.add(resultLabel);

        getContentPane().add(panel);
    }

    private void calculateProduct() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double product = num1 * num2;
            resultLabel.setText("Result: " + product);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!");
                PracticalNo_10Q4 app = new PracticalNo_10Q4();
                app.setVisible(true);
            }
        });
    }
}
