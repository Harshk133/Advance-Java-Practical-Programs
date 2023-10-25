// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write a program using Socket & ServerSocket to create chat application.
// Client-side Program!
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class PracticalNo_16Q2ClientChat {
    public static void main(String[] args) {
        try {
            try (Socket clientSocket = new Socket("localhost", 1234)) {
                System.out.println("Connected to server.");
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                Thread thread = new Thread(new ServerResponseHandler(in));
                thread.start();
                try (Scanner scanner = new Scanner(System.in)) {
                    String message;
                    while (true) {
                        message = scanner.nextLine();
                        out.println(message);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ServerResponseHandler implements Runnable {
    private BufferedReader in;
    public ServerResponseHandler(BufferedReader in) {
        this.in = in;
    }
    @Override
    public void run() {
        try {
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received from server: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

