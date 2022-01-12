package andrew;

import javax.swing.*;
public class Null {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Input your namber");
        String str;
        str = JOptionPane.showInputDialog(null, "Your namber",JOptionPane.QUESTION_MESSAGE);
        if (str != null && !str.equals("")) {
            int d = Integer.parseInt(str);
            if (d > 0) JOptionPane.showMessageDialog(null, "+");
            else if (d == 0) JOptionPane.showMessageDialog(null, "0");
            else JOptionPane.showMessageDialog(null, "-");
        } else {
            JOptionPane.showMessageDialog(null, "Input namber");
        }

    }

}

