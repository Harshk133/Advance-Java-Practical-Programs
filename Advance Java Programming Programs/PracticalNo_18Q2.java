// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write an output of the following code.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PracticalNo_18Q2 {
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "__h";
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection to the database created");
            Statement statement = connection.createStatement();            
            String query = "SELECT roll_no, name FROM student WHERE percentage > 70";
            ResultSet resultSet = statement.executeQuery(query);            
            System.out.println("Roll Number \t     Name");            
            while (resultSet.next()) {
                int rollNo = resultSet.getInt("roll_no");
                String name = resultSet.getString("name");
                System.out.println(rollNo + "\t\t" + name);
            }            
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }
}

