package LAB8;

import java.util.Scanner;

public class C8EX7 {
    public static void main(String[] args) {
        System.out.println("Please enter numbers, 0 or negative to stop...");
        Scanner scanner = new Scanner(System.in);
        int max =-1;
        int n1 = scanner.nextInt();
        while (n1 > 0) {
            if (n1>max) {
                max=n1;
            }
            n1 = scanner.nextInt();
        }
        System.out.println("max positive number=" + (max<0?"none":max));
        scanner.close();
    }
}
