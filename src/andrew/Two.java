package andrew;

import javax.swing.*;

public class Two {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog(null, "input one number");
        String b = JOptionPane.showInputDialog(null, "input two number");
        String oper = JOptionPane.showInputDialog(null, "input oper *, /, +, -");

        int i = Integer.parseInt(a);
        int x = Integer.parseInt(b);
        int res;

        if (oper.equals("+")) {
            res = i + x;
            System.out.println(res);
        }
        else if (oper.equals("-")) {
            res = i - x;
            System.out.println(res);
        }
        else if (oper.equals("*")) {
            res = i * x;
            System.out.println(res);
        }
        else if (oper.equals("/")) {
            res = i / x;
            System.out.println(res);
        }







    }


}
