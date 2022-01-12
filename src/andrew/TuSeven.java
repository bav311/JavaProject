//package andrew;

import javax.swing.*;

public class TuSeven {

    public static void main(String[] args) {
        String in;
        in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n > 0) JOptionPane.showMessageDialog(null,"Вы ввели положительное число");
            else if (n == 0) JOptionPane.showMessageDialog(null,"Вы ввели ноль");
            else JOptionPane.showMessageDialog(null,"Вы ввели отрицательное число");
        } else {
            JOptionPane.showMessageDialog(null,"Введите всё-таки число");
        }
    }
}
