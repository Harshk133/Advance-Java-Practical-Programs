// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Develop a program to update name of a student from Jack(Harsh Kale) to John
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PracticalNo_20Q3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "__h");
            String updateQuery = "UPDATE student SET name = ? WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setString(1, "John");
            statement.setString(2, "Harsh Kale");
            int rowsUpdated = statement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
            statement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
} 

