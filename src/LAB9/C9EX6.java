package LAB9;

import java.util.Scanner;

public class C9EX6 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += Math.pow(2,i);
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
