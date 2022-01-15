package temp;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    SwingDemo(){
        JFrame frame = new JFrame("A simple swing Applications");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab = new JLabel("Swing means powerful GUis");
        frame.add(lab);
        lab.setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });

    }
}
