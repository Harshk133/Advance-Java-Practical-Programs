// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Write a program to delete a record from a table.
import java.sql.*;
public class PracticalNo_20Q1 {
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "__h";
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 101);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

