package LAB8;

import java.util.Scanner;

public class C8EX23 {
    public static void main(String[] args) {
        System.out.println("Please enter a natural number...");
        Scanner scanner = new Scanner(System.in);
        int natNum = Math.abs(scanner.nextInt());
        for (int i = natNum; i > 0 ; i--) {
            if (natNum%i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
