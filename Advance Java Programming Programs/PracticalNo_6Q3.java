// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Program using JScrollPane in Advance Java Programming.

import javax.swing.*;
import java.awt.*;

public class PracticalNo_6Q3 extends JFrame {
    PracticalNo_6Q3(){
        super("ScrollPane Program in Advance Java Programming By Harsh Kale!");
        setLayout(new BorderLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea t = new JTextArea();
        for(int i = 0; i < 100; i++){
            t.append("Hello, world programmer Harsh Kale \n");
        }
        JScrollPane scrollPane = new JScrollPane(t);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Kale");
        new PracticalNo_6Q3();
    }
}
