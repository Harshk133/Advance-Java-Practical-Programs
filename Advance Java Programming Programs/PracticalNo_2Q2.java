// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Develop an application using list components to add names of 10 different cities.abstract

import java.awt.*;

public class PracticalNo_2Q2 extends Frame {
    public PracticalNo_2Q2(){
        setLayout(new FlowLayout());
        setTitle("List Components In Advance Java Programming");
        setSize(700, 700);
        setVisible(true);

        Label l = new Label("This Program is created by Harsh Kale!");

        List list = new List(4, false);
        list.add("Latur");
        list.add("Barshi");
        list.add("Solapur");
        list.add("Nanded");

        add(l);
        add(list);

    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_2Q2();
    }   
}
