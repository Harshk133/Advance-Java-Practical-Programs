// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write the output of following JDBC code.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PracticalNo_20Q2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "__h");
            PreparedStatement st = con.prepareStatement("UPDATE student SET id = ? WHERE name = ?");
            st.setInt(1, 3); 
            st.setString(2, "Abhijit"); 
            int rowsAffected = st.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

