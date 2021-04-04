package LAB3_4;

import java.util.Scanner;

public class C4EX8 {
    public static void main(String[] args) {
        System.out.println("Please enter a number ....");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The sum of digits is ..." + ((num%10)+(num/10)));
        scanner.close();
    }
}
