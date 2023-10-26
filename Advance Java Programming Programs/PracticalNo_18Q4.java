// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 4: 
// Develop a program to display the name and roll_no of students from "student table" having percentage > 70.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PracticalNo_18Q4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "__h";
        String selectQuery = "SELECT name, roll_no FROM student WHERE percentage > 70";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
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
            System.out.println("Error: " + e.getMessage());
        }
    }
}


