// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Find an error and correct it also display the output after corrections.

import java.awt.*;
import java.awt.event.KeyEvent;

public class PracticalNo_5Q2 extends Frame{
    MenuBar mb;
    MenuItem m1, m2, m3;
    Menu mn;
    MenuShortcut ms;

    PracticalNo_5Q2(){
        setTitle("Menubar Program By Harsh Kale!");
        setSize(700, 700);

        setLayout(null);

        ms = new MenuShortcut(KeyEvent.VK_X);

        mn = new Menu("File");

        mb = new MenuBar();

        m1 = new MenuItem("Open with VS Code");
        m2 = new MenuItem("Auto Save");
        m3 = new MenuItem("Harsh Kale");

        mn.add(m1);
        mn.add(m2);
        mn.addSeparator();
        mn.add(m3);

        mb.add(mn);
        setMenuBar(mb);
        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_5Q2();        
    }
}
