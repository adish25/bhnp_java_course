package LAB6;

import java.util.Scanner;

public class C6EX1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number ....");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num<0) {
            System.out.println("Negative");
        }
        else if (num==0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
        scanner.close();
    }
}
