// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Execute the following code and write the output.
import java.net.*;
public class PracticalNo_15Q1 {
    public static void main(String[] args) throws MalformedURLException {
        // URL url = new URL("https://github.com/Harshk133/Advance-Java-Practical-Programs/blob/main/Advance%20Java%20Programming%20Programs/PracticalNo_14Q2.java");
        URL url = new URL("https://www.javatpoint.com/javafx-tutorial");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("External form: " + url.toExternalForm());
    }
}
