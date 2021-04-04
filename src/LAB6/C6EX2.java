package LAB6;

import java.util.Scanner;

public class C6EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num3 > num2 && num2 > num1) {
            System.out.println("Increasing");
        }
        scanner.close();
    }
}
