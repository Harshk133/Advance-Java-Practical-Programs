
// Programmer: Harsh Moreshwar Kale
// Created Date: 13/09/2023
// Question 2: 
// Develop a Program to Demonstrate the use of JProgressBar.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticalNo_9Q2 {
    private static JProgressBar progressBar;
    private static JButton startButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JProgressBar Program By Harsh Kale");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);

            // Create a JProgressBar
            progressBar = new JProgressBar(0, 100);
            progressBar.setStringPainted(true);

            // Create a JButton to start progress
            startButton = new JButton("DownLoad MugBit!");
            startButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    startProgress();
                }
            });

            JPanel panel = new JPanel();
            panel.add(progressBar);
            panel.add(startButton);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void startProgress() {
        startButton.setEnabled(false); // Disable the button while the task is running

        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
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
                startButton.setEnabled(true); // Enable the button after the task is done
            }
        };

        worker.execute();
    }
}
