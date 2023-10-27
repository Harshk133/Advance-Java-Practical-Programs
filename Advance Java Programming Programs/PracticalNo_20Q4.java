// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 4: 
// Develop a program to delete all record for a product whose "price is greater than 500" and ID is "P1234"
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PracticalNo_20Q4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "__h");
            String deleteQuery = "DELETE FROM product WHERE percentage > ? AND id = ?";
            PreparedStatement statement = connection.prepareStatement(deleteQuery);
            statement.setDouble(1, 500);
            statement.setString(2, "P1234");
            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");
            statement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
