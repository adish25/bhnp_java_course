package LAB8;

import java.util.Scanner;

public class C8EX24 {
    public static void main(String[] args) {
        System.out.println("Please enter two natural numbers...");
        Scanner scanner = new Scanner(System.in);
        int natNum1 = Math.abs(scanner.nextInt());
        int natNum2 = Math.abs(scanner.nextInt());
        int natNum = (natNum1 < natNum2 ? natNum1 : natNum2);
        for (int i = natNum; i > 0; i--) {
            if (natNum1 % i == 0 && natNum2 % i == 0) {
                System.out.println("the highst common divider is " + i);
                break;
            }
        }
        scanner.close();
    }
}
