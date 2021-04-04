package LAB8;

import java.util.Scanner;

public class C8EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers, max & den...");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int den = scanner.nextInt();

        for (int i=0;i<=max;i+=den) {
            System.out.println("i=" + i);
        }
        scanner.close();
    }
}
