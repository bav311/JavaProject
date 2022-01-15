package ndr;

import javax.swing.*;
import java.awt.*;

public class BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new java.awt.BorderLayout());
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.setBackground(Color.darkGray);
        panel1.setBackground(Color.MAGENTA);
        panel2.setBackground(Color.PINK);
        panel3.setBackground(Color.ORANGE);
        panel4.setBackground(Color.CYAN);


        frame.add(panel1, java.awt.BorderLayout.PAGE_START);
        frame.add(panel2, java.awt.BorderLayout.PAGE_END);
        frame.add(panel3, java.awt.BorderLayout.EAST);
        frame.add(panel4, java.awt.BorderLayout.WEST);
        frame.add(panel, java.awt.BorderLayout.CENTER);

        JButton button = new JButton("The button");
        panel.add(button, java.awt.BorderLayout.PAGE_START);


        frame.setVisible(true);

    }
}
