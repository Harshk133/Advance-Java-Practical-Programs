// Here's a basic example that shows how to create a Swing label with the text "Hello from Swing!"

import java.awt.*;
import javax.swing.*;

public class Program_1 extends JFrame {
    public Program_1() {
        Container contentPane = getContentPane();
        JLabel jlabel = new JLabel("Hello From Swing!");
        contentPane.setLayout(new FlowLayout());
        contentPane.add(jlabel);
    }
}
