package LAB7;

import java.util.Scanner;

public class C7EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter a year...");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        } else {
            if (year % 4 == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        }
        System.out.println("Leap Year? " + (leapYear==true?"YES":"NO"));
        scanner.close();
    }
}
