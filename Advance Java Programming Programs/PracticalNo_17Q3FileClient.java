// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Write a program using DatagramPacket and DatagramSocket to copy the contents of one file into other.
// Client.java
import java.io.*;
import java.net.*;
public class PracticalNo_17Q3FileClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 1234;
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name to copy: ");
            String fileName = userInput.readLine();
            byte[] sendData = fileName.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            FileOutputStream fos = new FileOutputStream("copy-" + fileName);
            byte[] buffer = new byte[1024];
            System.out.println("Receiving file!!");
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                clientSocket.receive(receivePacket);
                int bytesRead = receivePacket.getLength();
                if (bytesRead == 0) {
                    break;
                }
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            clientSocket.close();
            System.out.println("File received successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
