package LAB6;

import java.util.Scanner;

public class C6EX5 {
    public static void main(String[] args) {
        System.out.println("Please enter emploee name and salery ...");
        Scanner scanner = new Scanner(System.in);
        String empName = scanner.next();
        double empSal = scanner.nextDouble();
        double restSal = 0;
        double tax = 0;
        if (empSal>220000) {   // 23K + 23K + 74K + 100K
            tax+=(empSal-220000)*0.5;
            empSal=220000;
        }
        if (empSal>120000) {   // 23K + 23K + 74K
            tax+=(empSal-120000)*0.4;
            empSal = 120000;
        }
        if (empSal>46000) {    // 23K + 23K
            tax+=(empSal-46000)*0.3;
            empSal = 46000;
        }
        if (empSal>23000) {
            tax+=(empSal-23000)*0.2;
            empSal = 23000;
        }
        tax+=empSal*0.1;

        System.out.println("Exmplee:" + empName + " Tax:" + tax);
        scanner.close();
    }
}
