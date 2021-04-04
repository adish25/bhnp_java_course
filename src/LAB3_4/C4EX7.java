package LAB3_4;

import java.util.Scanner;

public class C4EX7 {
    public static void main(String[] args) {
        System.out.println("Please enter a number ....");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The handres digit is ..." + num/100);
        scanner.close();
    }
}
