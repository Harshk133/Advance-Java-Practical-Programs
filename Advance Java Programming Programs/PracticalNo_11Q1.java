// Programmer: Harsh Moreshwar Kale
// Created Date: 22/09/2023
// Question 1: 
// Debug the following Program code and write the output.


// import java.awt.*;
// import java.awt.event.*;

// /* <APPLET CODE="MouseDemo" WIDTH=300 HEIGHT=200></APPLET>*/
// public class MouseDemo extends Applet implements MouseListener{
// Label l;

// public void init() {
//         setLayout(null);
//         l = new Label("Hello Mouse");
//         l.setBounds(50, 150, 200, 100);
//         add(l);
//     }

//     public void mousePressed(MouseEvent e) {
//         l.setText("Mouse Pressed no. of clicks:" + e.getClickCount() + "at position" + e.getX() + "," + e.getY());
//     }

//     public void mouseReleased(MouseEvent e){
//         l.setText("Mouse Released; # of clicks:"+e.getClickCount());
//         l.setText("Mouse Entered");
//     }

//     public void mouseEntered(MouseEvent e) {
//         l.setText("Mouse Entered!");
//     }

//     public void mouseExited(MouseEvent e) {
//         l.setText("Mouse Exited!");
//     }

//     public void mouseClicked(MouseEvent e) {
//         l.setText("Mouse exited");
//         l.setText("mouse clicked # of clicks:" + e.getClickCount());
//     }
// }

// Re writing the Above program in swing...
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_11Q1 extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton multiplyButton;
    private JLabel resultLabel;

    public PracticalNo_11Q1() {
        setTitle("Multiplication App");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Enter Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2Field = new JTextField(10);

        resultLabel = new JLabel("Result: ");

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateProduct();
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(new JLabel()); // Empty space
        panel.add(multiplyButton);
        panel.add(new JLabel()); // Empty space
        panel.add(resultLabel);

        getContentPane().add(panel);
    }

    private void calculateProduct() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double product = num1 * num2;
            resultLabel.setText("Result: " + product);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PracticalNo_11Q1 app = new PracticalNo_11Q1();
                app.setVisible(true);
            }
        });
    }
}

