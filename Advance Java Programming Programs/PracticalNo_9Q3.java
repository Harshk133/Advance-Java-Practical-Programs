
// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 3: 
// Write a program using JProgressBar to show the progress of progressbar when user clicks on JButton.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_9Q3 {
    private static JProgressBar progressBar;
    private static JButton startButton;
    private static JButton pauseButton;
    private static SwingWorker<Void, Integer> worker;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Progress Bar with Start and Pause By Harsh Kale!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);

            // Create a JProgressBar
            progressBar = new JProgressBar(0, 100);
            progressBar.setStringPainted(true);

            // Create a "Start" button
            startButton = new JButton("Download Mugbit!");
            startButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    startProgress();
                }
            });

            // Create a "Pause" button
            pauseButton = new JButton("Pause");
            pauseButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    pauseProgress();
                }
            });

            JPanel panel = new JPanel();
            panel.add(progressBar);
            panel.add(startButton);
            panel.add(pauseButton);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void startProgress() {
        startButton.setEnabled(false); // Disable the "Start" button while the task is running
        pauseButton.setEnabled(true); // Enable the "Pause" button

        worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    if (isCancelled()) {
                        break; // Exit the loop if the task is cancelled
                    }
                    Thread.sleep(100); // Simulate work (100 milliseconds)
                    publish(i); // Publish progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int latestProgress = chunks.get(chunks.size() - 1);
                progressBar.setValue(latestProgress); // Update progress bar
            }

            @Override
            protected void done() {
                progressBar.setValue(0); // Reset progress bar
                startButton.setEnabled(true); // Enable the "Start" button
                pauseButton.setEnabled(false); // Disable the "Pause" button
            }
        };

        worker.execute();
    }

    private static void pauseProgress() {
        if (worker != null) {
            worker.cancel(true); // Cancel the task
            startButton.setEnabled(true); // Enable the "Start" button
            pauseButton.setEnabled(false); // Disable the "Pause" button
        }
    }
}

