// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a Program for JTree Component!

import javax.swing.*;
import javax.swing.tree.*;

public class PracticalNo_7Q1 extends JFrame{
    PracticalNo_7Q1(){
        setTitle("JTree Program By Harsh Kale!");
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");

        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("Node first");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("Node second");

        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Node third");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("Node fourth");

        n1.add(n3);
        n1.add(n4);

        root.add(n1);
        root.add(n2);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        getContentPane().add(scrollPane);
        pack();

        setSize(700, 700);
    }
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        new PracticalNo_7Q1();
    }
}
