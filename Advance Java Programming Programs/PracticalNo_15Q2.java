// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write a program using URL class to retrieve the host, protocol port and file of URL http://www.msbte.org.in
import java.net.*;

public class PracticalNo_15Q2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.msbte.org.in");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("External form: " + url.toExternalForm());
    }
}
