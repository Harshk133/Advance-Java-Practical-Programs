// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Write a java program to display following output of GridBagLayout.

import java.awt.*;
import javax.swing.*;

public class PracticalNo_4Q3 extends JFrame {
    PracticalNo_4Q3(){
        setSize(700, 700);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(grid); 
        setTitle("GridBag Layout Example By Harsh Kale");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 0;
        this.add(new Label("Name: "), gbc);
        gbc.gridx = 1;
        gbc.gridy =  0;

        this.add(new TextField("Harsh", 1), gbc); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx=0; 
        gbc.weighty=0;
        this.add(new Label("Message"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        this.add(new TextArea(3, 5), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2; 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2; 
        gbc.gridheight=1;
        gbc.insets= new Insets (30, 0, 10, 0); this.add(new JButton("Submit"), gbc);
    }

    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_4Q3();
    }
}
