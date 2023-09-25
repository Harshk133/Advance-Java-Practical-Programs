// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a java program to demonstrate the use of grid layout of 5 * 5

import java.awt.*;

public class PracticalNo_3Q1 extends Frame {
    PracticalNo_3Q1(){
        setLayout(new GridLayout(5, 5));

        setTitle("Program of Grid Layout In Advance Java Programin by Harsh kale");
        setSize(700, 700);
        setVisible(true);

        for(int i = 1; i <= 20; i++){
            add(new Label("Cell " + i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_3Q1();
    }
}
