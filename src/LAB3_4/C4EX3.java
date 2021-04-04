package LAB3_4;

import java.util.Scanner;

public class C4EX3 {
    public static void main(String[] args) {
        System.out.println("Please enter diameter ....");
        Scanner scanner = new Scanner(System.in);
        int diam = scanner.nextInt();
        System.out.println("Please enter hight ....");
        int hight = scanner.nextInt();

        System.out.println("Volume:" + (hight*Math.PI*(Math.pow((diam / 2), 2))));

        scanner.close();
    }
}
