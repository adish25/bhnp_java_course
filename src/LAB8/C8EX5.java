package LAB8;

import java.util.Scanner;

public class C8EX5 {
    public static void main(String[] args) {
        System.out.println("Please enter numbers, -99 to stop...");
        Scanner scanner = new Scanner(System.in);
        int sum = 0, n1 = 0;
        do {
            sum += n1;
            n1 = scanner.nextInt();
        }
        while (n1 != -99);
        System.out.println("sum=" + sum);
        scanner.close();
    }
}
