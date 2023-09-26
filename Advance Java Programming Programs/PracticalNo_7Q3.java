// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Program to show root directory and its sub folder of your system.

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.tree.*;

public class PracticalNo_7Q3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTree Program");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            File rootDir = new File("D:/");
            DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootDir);
            DefaultTreeModel treeModel = new DefaultTreeModel(root);

            addSubfolders(root, rootDir);

            JTree tree = new JTree(treeModel);
            tree.setPreferredSize(new Dimension(300, 200));
            frame.add(tree, BorderLayout.CENTER);
            frame.pack(); // Use pack() to set the frame size based on its contents
            frame.setVisible(true);
        });
    }

    private static void addSubfolders(DefaultMutableTreeNode parent, File dir) {
        File[] subDirs = dir.listFiles();
        if (subDirs != null) {
            for (File subDir : subDirs) {
                if (subDir.isDirectory()) {
                    DefaultMutableTreeNode child = new DefaultMutableTreeNode(subDir);
                    parent.add(child);
                    addSubfolders(child, subDir);
                }
            }
        }
    }
}
