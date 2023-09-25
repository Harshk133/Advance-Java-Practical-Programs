// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a Program for Following output!

import java.awt.FlowLayout;
import javax.swing.*;

public class PracticalNo_6Q1 extends JFrame {
    PracticalNo_6Q1(){
        super("ComboBox Program by Harsh Kale");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String cities[] = {"Solapur", "Barshi", "Latur", "Banglore"};
        JComboBox<String> comboBox = new JComboBox<>(cities);
        JScrollPane scrollPane = new JScrollPane(comboBox);
        add(scrollPane);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Kale");
        new PracticalNo_6Q1();
    }
}
