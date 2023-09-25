// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 4: 
// Write a java program to display the use of border layout.!

import java.awt.*;

public class PracticalNo_3Q4 extends Frame{
    PracticalNo_3Q4(){
        setTitle("Program of border layout in advance java programming");
        setSize(700, 700);
        setVisible(true);
        setLayout(new BorderLayout(10, 10));

        Button northButton = new Button("North");
        add(northButton, BorderLayout.NORTH);

        Button southButton = new Button("South");
        add(southButton, BorderLayout.SOUTH);

        Button eastButton = new Button("East");
        add(eastButton, BorderLayout.EAST);

        Button wesButton = new Button("West");
        add(wesButton, BorderLayout.WEST);

        Button centerButton = new Button("Center");
        add(centerButton, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale!");
        new PracticalNo_3Q4();
    }
}
