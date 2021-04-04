package LAB8;

import java.util.Scanner;

public class C8EX8 {
    public static void main(String[] args) {
        System.out.println("Please enter numbers, 0 or negative to stop...");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int min = n1;
        while (n1 > 0) {
            if (n1<min) {
                min=n1;
            }
            n1 = scanner.nextInt();
        }
        System.out.println("min positive number=" + (min<=0?"none":min));
        scanner.close();
    }
}
