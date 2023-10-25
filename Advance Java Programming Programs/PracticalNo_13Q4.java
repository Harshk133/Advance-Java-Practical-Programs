// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 4: 
// Write a program using MouseMotionAdapter class to implement only one method mouseDragged().
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PracticalNo_13Q4 {
    private JFrame frame;
    private int startX, startY, endX, endY;
    public PracticalNo_13Q4() {
        frame = new JFrame("Mouse Drag Line Draw Application!");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
        drawingPanel.addMouseMotionListener(new MyMouseMotionAdapter());

        frame.setVisible(true);
    }
    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(startX, startY, endX, endY);
        }
    }
    class MyMouseMotionAdapter extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            endX = e.getX();
            endY = e.getY();
            frame.repaint();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Developer Harsh Moreshwar Kale!");
            new PracticalNo_13Q4();
        });
    }
}
