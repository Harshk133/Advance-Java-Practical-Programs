// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a java program to create menu of different colors and disable menu item for Black Color.

import java.awt.*;

public class PracticalNo_5Q1 extends Frame{
    MenuBar mb;
    Menu colorNameMenu;
    MenuItem redItem, orangItem, blueItem, blackItem;

    PracticalNo_5Q1(){
        setTitle("Advane Java Menu Program By Harsh Kale");
        setSize(700, 700);

        mb = new MenuBar();
        colorNameMenu = new Menu("Colors");

        redItem = new MenuItem("Red");
        orangItem = new MenuItem("Orange");
        blueItem = new MenuItem("Blue");
        blackItem = new MenuItem("Black");

        blackItem.setEnabled(false);

        colorNameMenu.add(redItem);
        colorNameMenu.add(orangItem);
        colorNameMenu.add(blueItem);
        colorNameMenu.add(blackItem);

        mb.add(colorNameMenu);
        setMenuBar(mb);

        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_5Q1();
    }
}
