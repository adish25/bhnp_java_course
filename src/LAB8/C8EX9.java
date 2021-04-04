package LAB8;

import java.util.Scanner;

public class C8EX9 {
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers ...");
        Scanner scanner = new Scanner(System.in);
        int maxOrder =0,i;
        int n1 = scanner.nextInt();
        int max=n1;
        for (i=1;i <= 10;i++) {
            if (n1>max) {
                max=n1;
                maxOrder=i;
            }
            n1 = scanner.nextInt();
        }
        System.out.println("max=" + max + " max order=" + maxOrder);
        scanner.close();
    }
}
