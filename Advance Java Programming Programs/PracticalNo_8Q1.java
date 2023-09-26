// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Develop a program to demonstrate the use of JTable.

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PracticalNo_8Q1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTable Program By Harsh Kale");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create sample data for the table
            String[] columnNames = {"Name", "Age", "Country"};
            Object[][] data = {
                {"Harsh", 70, "Latur"},
                {"Sanket", 25, "Sambhaji-Nagar"},
                {"Wadkar", 35, "Moti Nagar"},
                {"Omkar", 28, "Chincholi"},
                {"Kale", 40, "Barshi"}
            };

            // Create a DefaultTableModel
            DefaultTableModel model = new DefaultTableModel(data, columnNames);

            // Create a JTable with the model
            JTable table = new JTable(model);

            // Create a JScrollPane to add the table to
            JScrollPane scrollPane = new JScrollPane(table);

            // Add the scroll pane to the frame
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.pack();
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}

