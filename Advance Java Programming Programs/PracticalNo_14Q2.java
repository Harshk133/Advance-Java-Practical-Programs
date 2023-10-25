// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Develop a program using InetAddress class to retrieve IP address of computer when hostname is entered by the user.
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class PracticalNo_14Q2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any hostname: ");
        try (Scanner sc = new Scanner(System.in)) {
            String hostname = sc.nextLine();
            try {
                InetAddress address = InetAddress.getByName(hostname);
                if(address.isReachable(3000)){
                    System.out.println("IP Address: " + address.getHostAddress());
                }else{
                    System.out.println("Host Not Found!");
                }
            } catch (UnknownHostException e) {
                System.out.println("Unknown Host: " + hostname);
            }catch(Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
