package LAB8;

import java.util.Scanner;

public class C8EX22 {
    public static void main(String[] args) {
        System.out.println("Please enter a value...");
        Scanner scanner = new Scanner(System.in);
        int fibVal = Math.abs(scanner.nextInt());
        int f1 = 0;
        int f2 = 1;
        int fib=1;
        System.out.println("fibinacci > " + fibVal + "....");
        System.out.println(f2);
        while (fib <= fibVal) {
            fib=f1+f2;
            f1=f2;
            f2=fib;
            System.out.println(f2);
        }
        scanner.close();
    }
}
