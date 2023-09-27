// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 2: 
// Write a Program to change the background color of Applet when user performs events using Mouse
// Note 👉 I am using the `swing` because awt not working on my machine for that purpose I use Swing instead of applet! 

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PracticalNo_11Q2 extends JFrame {
    private JPanel panel;

    public PracticalNo_11Q2() {
        setTitle("Background Color Change App By Developer Harsh Kale");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.white);

        // Add a MouseListener to the panel
        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                changeBackgroundColor();
            }
        });

        getContentPane().add(panel);
    }

    private void changeBackgroundColor() {
        // Generate a random color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color randomColor = new Color(red, green, blue);

        // Set the panel's background color to the random color
        panel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale");
                PracticalNo_11Q2 app = new PracticalNo_11Q2();
                app.setVisible(true);
            }
        });
    }
}

