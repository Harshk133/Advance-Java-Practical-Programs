// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Write a program using DatagramPacket and DatagramSocket to copy the contents of one file into other.
// Server.java
import java.io.*;
import java.net.*;
public class PracticalNo_17Q3FileServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(1234);
            System.out.println("Server started. Waiting for client...");
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String fileName = new String(receivePacket.getData(), 0, receivePacket.getLength());
            File inputFile = new File(fileName);
            File outputFile = new File("copy-" + fileName);
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            System.out.println("Copying file...");
            while ((bytesRead = fis.read(buffer)) != -1) {
                DatagramPacket sendPacket = new DatagramPacket(buffer, bytesRead, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos.close();
            serverSocket.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
