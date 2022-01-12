package andrew;
import javax.swing.*;
public class One {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "input one number");
        String b = JOptionPane.showInputDialog(null, "input two number");
        String oper = JOptionPane.showInputDialog(null, "input oper *, /, +, -");
        if (a != null && !a.equals("")) {
            if (b != null && !b.equals("")) {
                if (oper != null && !oper.equals("")) {
                    int i = Integer.parseInt(a);
                    int x = Integer.parseInt(b);
                    int res;
                    switch (oper) {
                        case "+" -> {
                            res = i + x;
                            System.out.println(res);
                        }
                        case "-" -> {
                            res = i - x;
                            System.out.println(res);
                        }
                        case "*" -> {
                            res = i * x;
                            System.out.println(res);
                        }
                        case "/" -> {
                            res = i / x;
                            System.out.println(res);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Введите всё-таки число");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Введите всё-таки число");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Введите всё-таки число");
        }

    }


}
