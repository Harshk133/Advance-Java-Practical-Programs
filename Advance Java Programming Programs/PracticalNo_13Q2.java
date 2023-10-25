// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 2: 
// Write a program to demonstrate the use of WindowAdapter class
import javax.swing.*;
import java.awt.event.*;
public class PracticalNo_13Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Adapter Program By Harsh Kale!!");
        JLabel label = new JLabel("Close the window to exit.");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new MyWindowAdapter());
        frame.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Program By Harsh Kale!", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
