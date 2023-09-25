// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write the Output of the following program!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PracticalNo_4Q1 extends JFrame implements ActionListener{
    CardLayout card;
    JButton btn1, btn2, btn3;
    Container c;

    PracticalNo_4Q1(){
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);

        btn1 = new JButton("ReactJS");
        btn2 = new JButton("NodeJS");
        btn3 = new JButton("VueJS");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        c.add("A", btn1);
        c.add("B", btn2);
        c.add("C", btn3);
    }

    public void actionPerformed(ActionEvent e){
        card.next(c);
    }

    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        PracticalNo_4Q1 p = new PracticalNo_4Q1();
        p.setSize(700, 700);
        p.setVisible(true);
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
