package LAB5;

import java.util.Scanner;

public class C5EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter a whole number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Result: " + (num%2==0?"EVEN":"ODD"));
        scanner.close();
    }
}
