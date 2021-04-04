package LAB5;

import java.util.Scanner;

public class C5EX6 {
    public static void main(String[] args) {
        System.out.println("Please enter programer name and salery ...");
        Scanner scanner = new Scanner(System.in);
        String progName = scanner.next();
        double progSal = scanner.nextDouble();
        double newProgSal = progSal*1.1>6000?progSal*1.05:progSal*1.1;
        System.out.println("Programmer:" + progName + " New Salary:" + newProgSal);
        scanner.close();
    }
}
