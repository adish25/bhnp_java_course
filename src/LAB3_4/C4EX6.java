package LAB3_4;

import java.util.Scanner;

public class C4EX6 {
    public static void main(String[] args) {
        System.out.println("Please enter a number ....");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The 2nd last digit is ..." + (num/10)%10);
        scanner.close();

    }
}
