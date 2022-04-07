import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (500, 200);
        frame.setResizable(true);
        frame.setVisible (true);
        frame.setLocationRelativeTo(null); // to open the window in the main screen
    }
    }
