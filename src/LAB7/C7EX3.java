package LAB7;

import java.util.Scanner;

public class C7EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter 6 numbers (A-F)....");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        float x, y;
        int temp = A * E - B * D;
        if (temp != 0) {
            x = (C * E - B * F) / temp;
            y = (A * F - C * D) / temp;
            System.out.println("x=" + x + " y=" + y);
        } else {
            System.out.println("No Solution");
        }
        scanner.close();
    }
}
