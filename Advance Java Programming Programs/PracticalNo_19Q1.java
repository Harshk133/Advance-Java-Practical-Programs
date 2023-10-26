// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Write a Program to update row of student table from MSBTE database using Mysql 5.5 a database server.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PracticalNo_19Q1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "__h";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String selectQuery = "SELECT name, roll_no FROM student WHERE percentage > 70";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int rollNo = resultSet.getInt("roll_no");
                System.out.println("Name: " + name + ", Roll No: " + rollNo);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
    }
}
