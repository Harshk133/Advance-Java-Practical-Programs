// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Program to show table view of 10 students. (Name, Percentage, Grade).

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PracticalNo_8Q3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Table View");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Define column names
            String[] columnNames = {"Name", "Percentage", "Grade"};

            // Create sample data for 10 students
            Object[][] data = {
                {"Student 1", 85.5, "A"},
                {"Student 2", 78.0, "B"},
                {"Student 3", 92.3, "A"},
                {"Student 4", 63.7, "C"},
                {"Student 5", 77.8, "B"},
                {"Student 6", 88.2, "A"},
                {"Student 7", 72.5, "B"},
                {"Student 8", 95.1, "A"},
                {"Student 9", 61.9, "C"},
                {"Student 10", 84.6, "B"}
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
