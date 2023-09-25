// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Program using JComboBox to select different states of India or programming languages.

import java.awt.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class PracticalNo_6Q2 extends JFrame{
    PracticalNo_6Q2(){
        super("ComboBox Program by Harsh Kale");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String cities[] = {"C", "C++", "C#", "Java", "Python", "R"};
        JComboBox<String> comboBox = new JComboBox<>(cities);
        JScrollPane scrollPane = new JScrollPane(comboBox);
        add(scrollPane);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Kale");
        new PracticalNo_6Q2();
    }
}
