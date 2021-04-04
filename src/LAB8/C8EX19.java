package LAB8;

import java.util.Scanner;

public class C8EX19 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int nn = 1;
        for (int i = 1;i<=n1;i++) {
            nn *= i;
        }
        System.out.println("n! = " + nn);
        scanner.close();
    }
}
