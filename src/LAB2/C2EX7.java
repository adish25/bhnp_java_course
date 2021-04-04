package LAB2;

import java.util.Scanner;

public class C2EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.close();

        int i = 0;
        while (i<3) {
            System.out.println("num1 : " + num1 + " i: " + i);
            i++;
        }
    }
}
