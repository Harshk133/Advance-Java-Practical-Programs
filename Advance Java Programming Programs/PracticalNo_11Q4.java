// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 4: 
// Write a program to demonstrate the use of mouseDragged and mouseMoved method of MouseMotionListener.
// Note 👉 I am using the `swing` because awt not working on my machine for that purpose I use Swing instead of applet! 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticalNo_11Q4 extends JFrame implements MouseMotionListener {
    private JLabel positionLabel;

    public PracticalNo_11Q4() {
        setTitle("Mouse Motion Listener Application by Harsh Kale!!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        positionLabel = new JLabel("Mouse Position: ");
        positionLabel.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(positionLabel, BorderLayout.NORTH);

        // Add the MouseMotionListener to the JFrame
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        updateMousePosition(e);
    }

    public void mouseMoved(MouseEvent e) {
        updateMousePosition(e);
    }

    private void updateMousePosition(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        positionLabel.setText("Mouse Position: X=" + x + ", Y=" + y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Developer Harsh Kale!!");
                PracticalNo_11Q4 app = new PracticalNo_11Q4();
                app.setVisible(true);
            }
        });
    }
}

