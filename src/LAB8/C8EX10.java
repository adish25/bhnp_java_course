package LAB8;

import java.util.Scanner;

public class C8EX10 {
    public static void main(String[] args) {
        System.out.println("Please enter a numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        while (n1/10 > 0) {
            n1=n1/10;
        }
        System.out.println("the leftmost digit is =" + n1);
        scanner.close();
    }
}
