package LAB9;

import java.util.Scanner;

public class C9EX7 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        System.out.println("S1 ....");
        for (int i = 1; i <= num; i++) {
            if (i%10==0) {
                System.out.println(i + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("S2 ....");
        for (int i = 1; i <= num; i++) {
            if (i%10==0) {
                System.out.println(i*2 + " ");
            }
            else {
                System.out.print(i*2 + " ");
            }
        }
        scanner.close();
    }
}
