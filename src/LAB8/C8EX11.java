package LAB8;

import java.util.Scanner;

public class C8EX11 {
    public static void main(String[] args) {
        System.out.println("Please enter a numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int i = 1;
        while (n1/10 > 0) {
            n1=n1/10;
            i++;
        }
        System.out.println("the number of digits is =" + i);
        scanner.close();
    }
}
