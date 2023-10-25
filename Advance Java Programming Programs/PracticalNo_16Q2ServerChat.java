// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write a program using Socket & ServerSocket to create chat application.
// Server-side Program!
import java.io.*;
import java.net.*;
public class PracticalNo_16Q2ServerChat {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started. Waiting for clients...");
            Socket clientSocket1 = serverSocket.accept();
            System.out.println("Client 1 connected.");
            Socket clientSocket2 = serverSocket.accept();
            System.out.println("Client 2 connected.");
            BufferedReader in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
            PrintWriter out1 = new PrintWriter(clientSocket1.getOutputStream(), true);
            BufferedReader in2 = new BufferedReader(new InputStreamReader(clientSocket2.getInputStream()));
            PrintWriter out2 = new PrintWriter(clientSocket2.getOutputStream(), true);
            Thread thread1 = new Thread(new ClientHandler(in1, out2));
            Thread thread2 = new Thread(new ClientHandler(in2, out1));
            thread1.start();
            thread2.start();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ClientHandler implements Runnable {
    private BufferedReader in;
    private PrintWriter out;
    public ClientHandler(BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }
    @Override
    public void run() {
        try {
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received message: " + message);
                out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

