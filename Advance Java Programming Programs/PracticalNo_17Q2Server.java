// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 2: 
// Write a program using DatagramPacket and DatagramSocket to create chat application.
// Server.java
import java.io.*;
import java.net.*;
public class PracticalNo_17Q2Server {
    public static void main(String[] args) {
        try {
            try (DatagramSocket serverSocket = new DatagramSocket(1234)) {
                System.out.println("Server Listening & Waiting for client messages...");
                while (true) {
                    byte[] receiveData = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    serverSocket.receive(receivePacket);
                    String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println("Client: " + clientMessage);
                    String responseMessage = "Server received: " + clientMessage;
                    byte[] sendData = responseMessage.getBytes();
                    InetAddress clientAddress = receivePacket.getAddress();
                    int clientPort = receivePacket.getPort();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                    serverSocket.send(sendPacket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

