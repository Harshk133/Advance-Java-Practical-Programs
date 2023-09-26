// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Program to show root directory and its sub folder of your system.

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PracticalNo_8Q2 {
    public static void main(String[] args) {
        System.out.println("Developer Harsh Moreshwar Kale");
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTable Program By Harsh Kale");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create sample data for the table
            String[] columnNames = {"ID", "Name", "Salary"};
            Object[][] data = {
                {1, "Harsh Kale", "70,00,00,000"},
                {2, "Omanand Swami", "1200"},
                {3, "Prathmesh Bavge", "200"},
                {4, "Akshay Gitte", "2700"},
                {5, "Amay Devshatwar", "Infinity"}
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
