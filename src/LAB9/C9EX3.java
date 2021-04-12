package LAB9;

import java.util.Scanner;

public class C9EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res*=i;
        }
        System.out.println("N* = " + res);
        scanner.close();
    }
}
