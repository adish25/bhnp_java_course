package LAB9;

import java.util.Scanner;

public class C9EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers...");
        Scanner scanner = new Scanner(System.in);
        int num1 = Math.abs(scanner.nextInt());
        int num2 = Math.abs(scanner.nextInt());
        for (int i = (num1 < num2 ? num1 : num2); i <= (num1 < num2 ? num2 : num1); i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
