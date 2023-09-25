// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Design an application to demonstrate the Radio Button and Check box.

import java.awt.*;

class PracticalNo_1Q1 extends Frame{
    public PracticalNo_1Q1(){
        Frame myFrame = new Frame("Radion Button & Checkbox");
        myFrame.setLayout(new FlowLayout());
        myFrame.setTitle("Radio & Checkbox Button");
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
        myFrame.setResizable(true);


        Label infoOfProgrammer = new Label("// Programmer: Harsh Kale");

        Font myFont = new Font("Lucida Console", Font.BOLD, 17);
        Font myNewFont = new Font("Arial", Font.BOLD, 17);

        Label myLable = new Label("This is a program Demonstrating the Radion button and Check box!");
        myLable.setFont(myFont);

        Checkbox myCheckboxOne = new Checkbox("Python", true);
        myCheckboxOne.setFont(myNewFont);
        Checkbox myCheckboxTwo = new Checkbox("JavaScript", true);
        myCheckboxTwo.setFont(myNewFont);

        CheckboxGroup myCheckboxGroup = new CheckboxGroup();
        Checkbox radioBtnOne = new Checkbox("Genuis Programmer", true, myCheckboxGroup);
        radioBtnOne.setFont(myNewFont);
        Checkbox radioBtnTwo = new Checkbox("Hello world Programmer", true, myCheckboxGroup);
        radioBtnTwo.setFont(myNewFont);

        Component[] myObjects = {infoOfProgrammer, myLable, myCheckboxOne, myCheckboxTwo, radioBtnOne, radioBtnTwo};
        for(int i = 0; i < myObjects.length; i++){
            myFrame.add(myObjects[i]);
        }
    }

    public static void main(String[] args) {
        new PracticalNo_1Q1();
    }
}
