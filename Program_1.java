import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Program_1 extends JFrame implements ActionListener {
    // Globally Declared Variables!
    TextField tf1, tf2;
    Button btn1;
    Program_1(){
        setLayout(new FlowLayout());
        tf1 = new TextField(15);
        tf2 = new TextField(15);
        btn1 = new Button("Copy");
        tf2.setEditable(false);
        add(tf1);
        add(btn1);
        add(tf2);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String s = tf1.getText();
        tf2.setText(s);
    }

    public static void main(String[] args) {
        Program_1 h = new Program_1();
        h.setSize(300, 300);
        h.setTitle("Demonstrating Action Listener");
        h.setVisible(true);
    }
}
