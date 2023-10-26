// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Develop JDBC program to retrieve data using ResultSet.
import java.sql.*;
public class PracticalNo_19Q3 {
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "__h";
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idNo = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID Number: " + idNo);
                System.out.println("Name: " + name);
                System.out.println("-------------------");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

