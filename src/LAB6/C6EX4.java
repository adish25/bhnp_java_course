package LAB6;

import java.util.Scanner;

public class C6EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter a number, range 1 thru 9999");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numOfDigits;
        if (num < 10) {
            numOfDigits = 1;
        } else if (num < 100) {
            numOfDigits = 2;
        } else if (num < 1000) {
            numOfDigits = 3;
        } else {
            numOfDigits = 4;
        }
        System.out.println("Number of digits is:" + numOfDigits);
        scanner.close();
    }
}
