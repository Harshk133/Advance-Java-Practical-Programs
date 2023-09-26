// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a Program for Following output.

import javax.swing.*;
import javax.swing.tree.*;

public class PracticalNo_7Q2 extends JFrame {
    PracticalNo_7Q2() {
        setTitle("JTree Program By Harsh Kale");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Gujrat");
        DefaultMutableTreeNode node11 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode node12 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode node13 = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode node14 = new DefaultMutableTreeNode("Nagpur");
        DefaultMutableTreeNode node15 = new DefaultMutableTreeNode("Latur");
        node1.add(node11);
        node1.add(node12);
        node1.add(node13);
        node1.add(node14);
        node1.add(node15);
        rootNode.add(node1);
        rootNode.add(node2);
        JTree tree = new JTree(rootNode);
        JScrollPane scrollPane = new JScrollPane(tree);
        getContentPane().add(scrollPane);
        pack();
    }

    public static void main(String[] args) {
        System.out.println("Developer Harsh Kale!");
        new PracticalNo_7Q2();
    }
}
