package LAB5;

import java.util.Scanner;

public class C5EX5 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers ....");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Order: " + (num1<num2?num1+" "+num2:num2+" "+num1));
        scanner.close();
    }
}
