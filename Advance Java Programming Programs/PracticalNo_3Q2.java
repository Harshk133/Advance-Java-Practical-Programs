// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Write a java program to display the No. of buttons from 0 to 0.

import java.awt.*;

public class PracticalNo_3Q2 extends Frame{
    PracticalNo_3Q2(){
        setLayout(new GridLayout(3, 3));
        setTitle("Program of Grid layout in Advance Java Programing by Harsh Kale!");
        setSize(700, 700);
        setVisible(true);

        for(int i = 0; i <= 9; i++){
            add(new Button("Harsh " + i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_3Q2();
    }
}
