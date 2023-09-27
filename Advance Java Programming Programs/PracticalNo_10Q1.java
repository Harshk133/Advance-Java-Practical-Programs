// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 1: 
// Write a Program to demonstrate status of key on Applet Window such as KeyPressed, KeyReleased, KeyUp, KeyDown.

import javax.swing.*;
import java.awt.event.*;

public class PracticalNo_10Q1 extends JFrame implements KeyListener {
    private JLabel keyStatusLabel;

    public PracticalNo_10Q1() {
        setTitle("Key Status Program in Advance Java by Harsh Kale");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        keyStatusLabel = new JLabel("Key Status: ");
        keyStatusLabel.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(keyStatusLabel);
        addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) {
        keyStatusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        keyStatusLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        keyStatusLabel.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PracticalNo_10Q1 app = new PracticalNo_10Q1();
                app.setVisible(true);
            }
        });
    }
}
