// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Write a program to develop prime number server (Client will send any number to server, Server will send the response the number is prime or not!).
// Server-side Program
import java.io.*;
import java.net.*;
public class PracticalNo_16Q3Server {
    public static void main(String[] args) {
        try {
            try (ServerSocket serverSocket = new ServerSocket(1234)) {
                System.out.println("Server started. Waiting for client connection...");
                while (true) {
                    Socket socket = serverSocket.accept();
                    System.out.println("Client connected: " + socket);
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    int number = Integer.parseInt(in.readLine());
                    System.out.println("Number received from client: " + number);
                    boolean isPrime = checkPrime(number);
                    if (isPrime) {
                        out.println(number + " is a prime number");
                    } else {
                        out.println(number + " is not a prime number");
                    }
                    socket.close();
                    System.out.println("Client disconnected");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

