// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 1: 
// Write a program to check credentials of users (Client will send user id and password to server and server will authenticate the client using equals())
// Server-side Program!
import java.io.*;
import java.net.*;
public class PracticalNo_16Q1_Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started. Waiting for client connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String userId = in.readLine();
            String password = in.readLine();
            boolean isAuthenticated = authenticate(userId, password);
            out.println(isAuthenticated);
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static boolean authenticate(String userId, String password) {
        return userId.equals("harsh") && password.equals("helloworldprogrammer");
    }
}

