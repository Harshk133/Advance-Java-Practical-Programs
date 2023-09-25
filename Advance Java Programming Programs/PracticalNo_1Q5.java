// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 5: 
// Develop a Program to Create 3 buttons with caption ok, reset, cancel.

import java.awt.*;

public class PracticalNo_1Q5 extends Frame{
    public PracticalNo_1Q5(){
        setLayout(new FlowLayout());
        setTitle("Advance Java Programming By Harsh Kale!");
        setSize(700, 700);
        setVisible(true);

        Label l = new Label("Developer Harsh Moreshwar Kale, Click through the following buttons!");

        Button ok = new Button("OK");
        Button reset = new Button("RESET");
        Button cancel = new Button("CANCEL");

        add(l);
        add(ok);
        add(reset);
        add(cancel);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_1Q5();
    }
}
