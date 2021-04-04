package LAB8;

import java.util.Scanner;

public class C8EX15 {
    public static void main(String[] args) {
        System.out.println("Please enter a number...");
        Scanner scanner = new Scanner(System.in);
        int n1 = Math.abs(scanner.nextInt());
        int n1Save = n1;
        int n2 = 0;
        while (n1 > 0) {
            n2 += n1 % 10;
            n2 *= 10;
            n1 = n1 / 10;
        }
        n2 = n2/10;
        System.out.println("the number " + (n1Save == n2? "is" : "is not") + " a polindrom ");
        scanner.close();
    }
}
