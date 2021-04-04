package LAB8;

import java.util.Scanner;

public class C8EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers...");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1>n2) {
            int tmp=n1;
            n1=n2;
            n2=tmp;
        }
        for (int i=n1;i<=n2;i++) {
            System.out.println("i=" + i);
        }
        scanner.close();
    }
}
