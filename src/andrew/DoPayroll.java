package andrew;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("A:/Employeeinfo.txt"));
        for ( int empNum = 1; empNum<=4; empNum++){
            payOneEmployee(diskScanner);
        }
    }

    static void payOneEmployee(Scanner aScanner){
        Employee anEmployee = new Employee();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }

}
