package LAB8;

import java.util.Scanner;

public class C8EX12 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int sum=0;
        while (n1 > 0) {
            sum+=n1%10;
            n1=n1/10;
        }
        System.out.println("the sum of digits is =" + sum);
        scanner.close();
    }
}
