// Debug the following code and write the output of following code.
import java.awt.*;
import java.awt.event.*;
public class PracticalNo_13Q1 {
    Frame f;
    PracticalNo_13Q1() {
        f = new Frame("Window Adapter!");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0); 
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true); 
    }
    public static void main(String[] args) {
        new PracticalNo_13Q1();
    }
}


