package LAB8;

import java.util.Scanner;

public class C8EX16 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int n2 = Math.abs(scanner.nextInt());
        int sum=0;
        for (int i=0;i<n2;i++) {
            sum += n1;
        }
        System.out.println("native ... " + n1 + " * " + n2 + " = " + sum);
        scanner.close();
    }
}
