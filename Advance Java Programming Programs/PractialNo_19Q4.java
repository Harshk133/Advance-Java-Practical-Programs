// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 4: 
// Develop a program to update a record in database table.
import java.sql.*;
public class PractialNo_19Q4 {
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "__h";
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "UPDATE student SET name = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "New Name"); 
            statement.setInt(2, 101);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
