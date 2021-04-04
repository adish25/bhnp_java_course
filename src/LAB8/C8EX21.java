package LAB8;

import java.util.Scanner;

public class C8EX21 {
    public static void main(String[] args) {
        System.out.println("Please enter a fibonacci index...");
        Scanner scanner = new Scanner(System.in);
        int fibIdx = Math.abs(scanner.nextInt());
        int f1 = 0;
        int f2 = 1;
        int fib=1;
        for (int i = 2; i <= fibIdx; i++) {
            fib=f1+f2;
            f1=f2;
            f2=fib;
        }
        System.out.println("fibinacci ("+fibIdx+") = " + fib);
        scanner.close();
    }
}
