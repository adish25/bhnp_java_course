package LAB9;

import java.util.Scanner;

public class C9EX8 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 4 == 0) {
                sum += i;
            } else if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
