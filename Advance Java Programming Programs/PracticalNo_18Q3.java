// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Develop a program to create employee table in database having two columns "emp_id" and "emp_name"
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class PracticalNo_18Q3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "__h";
        String createTableQuery = "CREATE TABLE employee (emp_id INT PRIMARY KEY, emp_name VARCHAR(50))";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableQuery);
            System.out.println("Employee table created successfully");
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found");
        } catch (SQLException e) {
            System.out.println("Error creating employee table: " + e.getMessage());
        }
    }
}
