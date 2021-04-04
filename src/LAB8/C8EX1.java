package LAB8;

import java.util.Scanner;

public class C8EX1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int top = scanner.nextInt();
        for (int i=1;i<=top;i++) {
            System.out.println("i=" + i);
        }
        scanner.close();
    }
}
