// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Design an application to create a form with the use of text field, text area, button and label.

import java.awt.*;

public class PracticalNo_1Q2 extends Frame {
    public PracticalNo_1Q2(){
        setLayout(new FlowLayout());
        setTitle("Application of Text Field, Text Area, Button and Label!");
        setSize(700, 700);
        setVisible(true);
        
        Font ff1 = new Font("Times New Roman", Font.BOLD, 12);
        Font ff2 = new Font("Arial", Font.ITALIC, 17);

        Label label1 = new Label("Application of Textfield, Textarea, Button and Label! By Developer Harsh Kale");
        label1.setFont(ff1);
        label1.setBounds(15, 40, 450, 30);
        Label label2 = new Label("Form", Label.CENTER);
        label2.setFont(ff2);
        label2.setBounds(210, 90, 80, 20);

        Label ln = new Label("Enter Your Name: ", Label.LEFT);
        TextField tfn = new TextField();
        ln.setBounds(30, 140, 110, 20);
        tfn.setBounds(180, 140, 250, 20);

        Label rollno = new Label("Enter Your Roll No.: ", Label.LEFT);
        TextField tfrn = new TextField();
        rollno.setBounds(30, 180, 150, 20);
        tfrn.setBounds(180, 180, 250, 20);

        Label addrs = new Label("Enter Your Address: ", Label.LEFT);
        TextArea taddress = new TextArea();
        addrs.setBounds(30, 220, 170, 20);
        taddress.setBounds(180, 250, 250, 125);

        Button submit = new Button("Submit!");
        Button reset = new Button("Reset!!");
        submit.setBounds(200, 425, 100, 30);
        reset.setBounds(200, 455, 100, 30);

        add(label1);
        add(label2);
        add(ln);
        add(rollno);
        add(tfn);
        add(tfrn);
        add(addrs);
        add(taddress);
        add(submit);
        add(reset);

    }
    public static void main(String[] args) {
        System.out.println("Hello, world Programmer! Harsh Moreshwar Kale");
        new PracticalNo_1Q2();
    }
}
