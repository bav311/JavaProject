package andrew;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

class TeamFrame extends JFrame {

    public TeamFrame() throws IOException {
        Player player;
        Scanner myScanner =
                new Scanner(new File("A:/Hankees.txt"));

        for (int num = 1; num <= 9; num++) {
            player =
                    new Player(myScanner.nextLine(),
                            myScanner.nextDouble());
            myScanner.nextLine();

            addPlayerInfo(player);
        }

        setTitle("The Hankees");
        setLayout(new GridLayout(9,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void addPlayerInfo(Player player) {
        add(new JLabel(player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}
