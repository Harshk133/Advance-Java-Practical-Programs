// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 4: 
// Write a Program using JTextField to perform the addition of two numbers.



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_12Q4 extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton;
    private JLabel resultLabel;

    public PracticalNo_12Q4() {
        setTitle("Addition Application By Harsh Kale!!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Enter Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2Field = new JTextField(10);

        resultLabel = new JLabel("Result: ");

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performAddition();
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(new JLabel()); // Empty space
        panel.add(addButton);
        panel.add(new JLabel()); // Empty space
        panel.add(resultLabel);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void performAddition() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 + num2;
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!");
                PracticalNo_12Q4 app = new PracticalNo_12Q4();
                app.setVisible(true);
            }
        });
    }
}

