package LAB5;

import java.util.Scanner;

public class C5EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1%num2==0) {
            System.out.println("num1 / num2");
        }
        if (num2%num1==0) {
            System.out.println("num2 / num1");
        }
        scanner.close();
    }
}
