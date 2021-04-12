package LAB9;

import java.util.Scanner;

public class C9EX5 {
    public static void main(String[] args) {
        System.out.println("Please enter 99 numbers...");
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            num = Math.abs(scanner.nextInt());
            sum += (i % 3 == 0 ? num : 0);
        }
        System.out.println("sum: every third number = " + sum);
        scanner.close();
    }
}
