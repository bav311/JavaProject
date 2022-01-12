package andrew;
import java.text.DecimalFormat;
public class UseAccount {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.###");

        Account myAccount = new Account();
        myAccount.setName("Барри");
        myAccount.setAddress("222 Inner Lane");
        myAccount.setBalance(24.02);

        Account yourAccount = new Account();
        yourAccount.setName("Джейн");
        yourAccount.setAddress("121 System.outer Street");
        yourAccount.setBalance(55.63);

       /* System.out.print(myAccount.getName());
        System.out.println();
        System.out.print(" плюс $");
        System.out.print(df.format(myAccount.qetInterest(5.00)) + " дохода");
        System.out.println();

        double yourInterestRate = 7.00;
        System.out.print(" плюс $");
        double yourInterestAmount = yourAccount.qetInterest(yourInterestRate);
        System.out.print(df.format(yourInterestAmount));
        System.out.print(" дохода");*/

        myAccount.setBalance(myAccount.getBalance()+100);

        System.out.print(myAccount.getName());
        System.out.print(" (");
        System.out.print(myAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(myAccount.getBalance());
        System.out.print(" годовой доход ");
        System.out.print(df.format(myAccount.getInterest(5)));
        System.out.println();
        System.out.print(yourAccount.getName());
        System.out.print(" (");
        System.out.print(yourAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(yourAccount.getBalance());
        System.out.print(" годовой доход ");
        System.out.print(df.format(yourAccount.getInterest(7)));





    }

}