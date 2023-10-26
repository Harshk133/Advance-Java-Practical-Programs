// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write the output of followign JDBC code. User Mysql server 5.5 as databse server.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PracticalNo_19Q2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "__h";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO student (id, name, age) VALUES (?, ?, ?)");
            stmt.setInt(1, 101);
            stmt.setString(2, "Abhishek"); 
            stmt.setInt(3, 25); 
            int i = stmt.executeUpdate(); 
            System.out.println(i + " records inserted");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
