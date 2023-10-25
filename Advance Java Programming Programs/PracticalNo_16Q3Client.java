// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Write a program to develop prime number server (Client will send any number to server, Server will send the response the number is prime or not!).
// Client-side Program
import java.io.*;
import java.net.*;
public class PracticalNo_16Q3Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(userInput.readLine());
            out.println(number);
            String response = in.readLine();
            System.out.println("Response from server: " + response);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

