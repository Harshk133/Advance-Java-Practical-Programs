// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Develop a program using Label to display the message "Welcome to Java Programming".

import java.awt.*;

public class PracticalNo_1Q3 extends Frame {
    public PracticalNo_1Q3(){
        setTitle("Displaying the \'Welcome to Java Programming\' message on the frame!");
        setSize(700, 700);
        setVisible(true);

        Font ff = new Font("Arial", Font.ITALIC, 20);

        Label l = new Label("Welcome to Java Programming", Label.LEFT);
        l.setFont(ff);
        add(l);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_1Q3();
    }
}
