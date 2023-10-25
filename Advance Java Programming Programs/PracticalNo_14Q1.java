// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Execute the following code and write the output.
import java.net.*;

public class PracticalNo_14Q1 {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
