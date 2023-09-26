// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 1: 
// Write a program to launch a JProgressBar.


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_9Q1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JProgressBar By Harsh Kale!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);

            // Create a JProgressBar
            JProgressBar progressBar = new JProgressBar(0, 100);
            progressBar.setStringPainted(true);

            // Create a JButton to start progress
            JButton startButton = new JButton("Start Progress");
            
            // ActionListener for the start button
            startButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Simulate a task that takes some time
                    Thread taskThread = new Thread(new Runnable() {
                        public void run() {
                            for (int i = 0; i <= 100; i++) {
                                final int progressValue = i;
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        progressBar.setValue(progressValue);
                                    }
                                });
                                try {
                                    Thread.sleep(100); // Simulate some work
                                } catch (InterruptedException ex) {
                                    ex.printStackTrace();
                                }
                            }
                        }
                    });
                    taskThread.start();
                }
            });

            JPanel panel = new JPanel();
            panel.add(progressBar);
            panel.add(startButton);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

