// Programmer: Harsh Moreshwar Kale
// Created Date: 25/10/2023
// Question 3: 
// Write a program using URL and URLConnection class to retrieve the date, content type, content length information of any entered URL
import java.net.*;
import java.util.Scanner;
import java.util.Date;
public class PracticalNo_15Q3 {
    public static void main(String[] args) {
        System.out.println("Enter any URL: ");
        Scanner sc = new Scanner(System.in);
        String urlStr = sc.nextLine();
        try {
            URL url = new URL(urlStr);
            URLConnection connection = url.openConnection();
            long date = connection.getDate();
            Date todayDate = new Date(date);
            System.out.println("Date: " + todayDate);
            String contentType = connection.getContentType();
            System.out.println("Content Type: " + contentType);
            int contentLength = connection.getContentLength();
            System.out.println("Content length: " + contentLength);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
