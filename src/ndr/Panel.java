package ndr;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя форма");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout());
        frame.setVisible(true);

        JPanel myPanel = new JPanel();
        JPanel myPanel1 = new JPanel();
        JPanel myPanel2 = new JPanel();
        myPanel.setBackground(Color.YELLOW);
        myPanel1.setBackground(Color.MAGENTA);
        myPanel2.setBackground(Color.getHSBColor(220, 55, 9));
        frame.add(myPanel);
        frame.add(myPanel1);
        frame.add(myPanel2);


        JButton button = new JButton("Button1");
        JButton button1 = new JButton("Button2");
        JButton button2 = new JButton("Button3");
        myPanel.add(button);
        myPanel1.add(button1);
        myPanel2.add(button2);

    }
}
