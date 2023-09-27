// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 2: 
// Write a program to generate KeyEvent when a key is pressed and display "KeyPressed" message.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Robot;

public class PracticalNo_10Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyEvent Simulation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton simulateButton = new JButton("Simulate Key Press");
        panel.add(simulateButton);
        
        JLabel statusLabel = new JLabel("Status: ");
        panel.add(statusLabel);

        frame.setVisible(true);

        simulateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Robot robot = new Robot();
                    // Press the space key to trigger event!!
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    statusLabel.setText("Status: KeyPressed");
                } catch (AWTException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
