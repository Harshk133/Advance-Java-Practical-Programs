// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 4: 
// Develop a Program to Select Multiple Languages known to User.

import java.awt.*;

public class PracticalNo_1Q4 extends Frame{
    public PracticalNo_1Q4(){
        setLayout(new FlowLayout());
        setTitle("Advance Java Program!");
        setSize(700, 700);
        setVisible(true);

        Label l = new Label("Select from the following! which language you used in your daily life!");
        
        Checkbox cmr = new Checkbox("Marathi (मराठी)");
        Checkbox chi = new Checkbox("Hindi");
        Checkbox csk = new Checkbox("Sanskrit");
        Checkbox cpy = new Checkbox("Python");
        Checkbox cc = new Checkbox("C");

        add(l);
        add(cmr);
        add(chi);
        add(csk);
        add(cpy);
        add(cc);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_1Q4();
    }
}
