// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 3: 
// Develop a program which will implement special keys such as function keys and arrow keys.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticalNo_10Q3 extends JFrame implements KeyListener {
    private JTextArea textArea;

    public PracticalNo_10Q3() {
        setTitle("Special Keys Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.addKeyListener(this);

        getContentPane().add(textArea);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_F1) {
            textArea.append("F1 key pressed\n");
        } else if (keyCode == KeyEvent.VK_F2) {
            textArea.append("F2 key pressed\n");
        } else if (keyCode == KeyEvent.VK_UP) {
            textArea.append("Up arrow key pressed\n");
        } else if (keyCode == KeyEvent.VK_DOWN) {
            textArea.append("Down arrow key pressed\n");
        } else if (keyCode == KeyEvent.VK_LEFT) {
            textArea.append("Left arrow key pressed\n");
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            textArea.append("Right arrow key pressed\n");
        }
    }

    public void keyReleased(KeyEvent e) {
        // Handle keyReleased event (not used in this example)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PracticalNo_10Q3 example = new PracticalNo_10Q3();
                example.setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
