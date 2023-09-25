// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a java program to show following output in list!

import java.awt.*;

public class PracticalNo_2Q1 extends Frame {
    public PracticalNo_2Q1(){
        setLayout(new FlowLayout());
        setTitle("Demo of List in Advance Java Programming!");
        setSize(700, 700);
        setVisible(true);

        Label l = new Label("Here is the program of list in advance java programming by Harsh Kale!");

        List list = new List(3, false);
        list.add("Summer");
        list.add("Winter");
        list.add("Rainy");

        add(l);
        add(list);

    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_2Q1();
    }
}
