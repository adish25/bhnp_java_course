package LAB3_4;

import java.util.Scanner;

public class C4EX10 {
    public static void main(String[] args) {
        System.out.println("Please enter a number ....");
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        int num1 = (int)(num+2-num%2);
        System.out.println("The closest whole double number ..." + num1);
        scanner.close();

    }
}
