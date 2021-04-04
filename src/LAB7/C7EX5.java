package LAB7;

import java.util.Scanner;

public class C7EX5 {
    public static void main(String[] args) {
        System.out.println("Please enter year and month...");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int noOfDays;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            noOfDays = 31;
        } else if (month == 2) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
            } else {
                if (year % 4 == 0) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
            }
        } else {
            noOfDays = 30;
        }
        System.out.println("Number of Daya ... " + noOfDays);
        scanner.close();
    }
}
