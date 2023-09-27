// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 3: 
// Write a program to count the number of clicks performed by the user in a Frame window.
// Note 👉 I am using the `swing` because awt not working on my machine for that purpose I use Swing instead of applet! 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticalNo_11Q3 extends JFrame {
    private int clickCount = 0;
    private JLabel clickLabel;

    public PracticalNo_11Q3() {
        setTitle("Click Counter Application By Harsh Kale!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        clickLabel = new JLabel("Click count: 0");
        panel.add(clickLabel, BorderLayout.CENTER);

        getContentPane().add(panel);

        // Add a MouseListener to the frame
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                incrementClickCount();
            }
        });
    }

    private void incrementClickCount() {
        clickCount++;
        clickLabel.setText("Click count: " + clickCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!");
                PracticalNo_11Q3 app = new PracticalNo_11Q3();
                app.setVisible(true);
            }
        });
    }
}

