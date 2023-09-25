// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Write a java program to display the No. of buttons from 0 to 0.

import java.awt.*;

public class PracticalNo_3Q3 extends Frame{
    PracticalNo_3Q3(){
        setLayout(new GridLayout(3, 2, 20, 20));
        setTitle("Program of Grid Layout in Advance Java Programing by Harsh Kale!");
        setSize(700, 700);
        setVisible(true);

        for(int i = 0; i <= 7; i++){
            Button btn = new Button("Harsh " + i);
            add(btn);
        }
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_3Q3();
    }    
}