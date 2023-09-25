// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Develop an application select multiple names of news paper.

import java.awt.*;

public class PracticalNo_2Q3 extends Frame {
    public PracticalNo_2Q3(){
        setLayout(new FlowLayout());
        setTitle("Program of List Components in Advance Java Programming!");
        setSize(700, 700);
        setVisible(true);

        Label l = new Label("This is a program of compoenents to select the names of news papers by Harsh Kale!");

        List list = new List(4, true);
        list.add("Lokmat");
        list.add("The New Indian Times");
        list.add("The Hindu");
        list.add("Dyandeep");
        list.add("Maradhi Paper");

        add(l);
        add(list);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_2Q3();
    }
}
