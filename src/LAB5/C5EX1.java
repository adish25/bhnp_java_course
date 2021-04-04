package LAB5;

import java.util.Scanner;

public class C5EX1 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1>num2) {
            System.out.println("Growing");
        }
        scanner.close();
    }
}
