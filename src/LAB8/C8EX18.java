package LAB8;

import java.util.Scanner;

public class C8EX18 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int n2 = Math.abs(scanner.nextInt());
        int m1 = n1;
        int i=0;
        while (m1 >= n2) {
            m1 -= n2;
            i++;
        }
        System.out.println("native ... " + n1 + " / " + n2 + " = " + i);
        System.out.println("native ... " + n1 + " % " + n2 + " = " + (n1-n2*i));
        scanner.close();
    }
}
