package LAB8;

import java.util.Scanner;

public class C8EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int top = scanner.nextInt();
        for (int i=0;i<=top;i+=2) {
            System.out.println("i=" + i);
        }
        scanner.close();
    }
}
