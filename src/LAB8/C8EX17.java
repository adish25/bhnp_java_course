package LAB8;

import java.util.Scanner;

public class C8EX17 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int n2 = Math.abs(scanner.nextInt());
        int pow=1;
        for (int i=0;i<n2;i++) {
            pow *= n1;
        }
        System.out.println("native ... " + n1 + " ** " + n2 + " = " + pow);
        scanner.close();
    }
}
