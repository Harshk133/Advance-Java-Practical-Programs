// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 3: 
// Write a program to demonstrate the use of anonymous inner class!
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PracticalNo_13Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Developer Harsh Kale!");
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 150, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Harsh Kale!");
            }
        });
        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

