package LAB8;

import java.util.Scanner;

public class C8EX6 {
    public static void main(String[] args) {
        System.out.println("Please enter numbers, 0 to stop...");
        Scanner scanner = new Scanner(System.in);
        int sum =0,i;
        int n1 = scanner.nextInt();
        for (i=0;n1 != 0;i++) {
            sum += n1;
            n1 = scanner.nextInt();
        }
        System.out.println("sum=" + sum + " i=" + i + " avg=" + (i>0?(float)sum/i:0));
        scanner.close();
    }
}
