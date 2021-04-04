package LAB6;

import java.util.Scanner;

public class C6EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("max=" + max);
        System.out.println("math.max=" + Math.max(num1,Math.max(num2,num3)));
        scanner.close();
    }
}
