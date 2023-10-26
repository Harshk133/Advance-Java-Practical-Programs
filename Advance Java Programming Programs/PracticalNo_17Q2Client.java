// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write a program using DatagramPacket and DatagramSocket to create chat application.
// Client.java
import java.io.*;
import java.net.*;
public class PracticalNo_17Q2Client {
    public static void main(String[] args) {
        try {
            try (DatagramSocket clientSocket = new DatagramSocket()) {
                InetAddress serverAddress = InetAddress.getByName("localhost");
                int serverPort = 1234;
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    System.out.print("You: ");
                    String message = userInput.readLine();
                    byte[] sendData = message.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                    clientSocket.send(sendPacket);
                    byte[] receiveData = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    clientSocket.receive(receivePacket);
                    String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println("Server: " + serverResponse);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
