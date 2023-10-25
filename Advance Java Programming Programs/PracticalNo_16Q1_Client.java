// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Write a program to check credentials of users (Client will send user id and password to server and server will authenticate the client using equals())
// Client-side Program!
import java.io.*;
import java.net.*;
public class PracticalNo_16Q1_Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 1234);
            System.out.println("Connected to server!!");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter user ID: ");
            String userId = userInput.readLine();
            System.out.print("Enter password: ");
            String password = userInput.readLine();
            out.println(userId);
            out.println(password);
            boolean isAuthenticated = Boolean.parseBoolean(in.readLine());
            if (isAuthenticated) {
                System.out.println("Authentication is successfull!!");
            } else {
                System.out.println("Authentication is failed, Try Again!");
            }
            in.close();
            out.close();
            userInput.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}