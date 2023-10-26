// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 4: 
// Write a program using DatagramPacket and DatagramSocket to transfer the file from one location to another.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class PracticalNo_17Q4 {
    public static void main(String[] args) {
        String sourceFile = "D:\\MyPrograms\\aajchaabhyass.com\\Java Practice Programs\\Advance Java\\Programs\\Advance Java Programming Programs\\Harsh.txt";        
        String destinationFolder = "C:\\Users\\Hp\\Desktop\\directory\\";
        String destinationFile = destinationFolder + "Harsh.txt";
        String serverIP = "127.0.0.1";
        int serverPort = 12345;
        int bufferSize = 1024;
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            File file = new File(sourceFile);
            long fileSize = file.length();
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName(serverIP);
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            int totalBytesSent = 0;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                DatagramPacket packet = new DatagramPacket(buffer, bytesRead, serverAddress, serverPort);
                socket.send(packet);
                totalBytesSent += bytesRead;
                System.out.println("Sent " + totalBytesSent + " bytes out of " + fileSize + " bytes");
                System.out.println("Transfer complete and successful");
            }
            socket.close();
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
            byte[] receiveBuffer = new byte[bufferSize];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, bufferSize);
            while (true) {
                socket.receive(receivePacket);
                byte[] data = receivePacket.getData();
                fileOutputStream.write(data);
                if (receivePacket.getLength() < bufferSize) {
                    break;
                }
            }
            fileOutputStream.close();
            System.out.println("File transfer completed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
