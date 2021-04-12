package LAB9;

import java.util.Scanner;

public class C9EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (i % 3 == 0 ? i : 0);
        }
        System.out.println("sum: number%3  (until " + num + ") = " + sum);
        scanner.close();
    }
}
