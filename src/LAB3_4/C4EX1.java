package LAB3_4;

import java.util.Scanner;

public class C4EX1 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println("Sum:" + (n1+n2+n3));
        System.out.println("Avg:" + ((n1+n2+n3)/3.0));

        scanner.close();
    }
}
