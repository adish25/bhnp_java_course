package LAB8;

import java.util.Scanner;

public class C8EX13 {
    public static void main(String[] args) {
        System.out.println("Please enter a numbers and a digit...");
        Scanner scanner = new Scanner(System.in);
        int x = Math.abs(scanner.nextInt());
        int xSave = x;
        int dig = Math.abs(scanner.nextInt());
        int i=0;
        while (x > 0) {
            if (dig==x%10) {
                i++;
            }
            x=x/10;
        }
        System.out.println("the number of times digit " + dig + " in " +  xSave + " is " + i);
        scanner.close();
    }
}
