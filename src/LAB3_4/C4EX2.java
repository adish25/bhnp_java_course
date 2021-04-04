package LAB3_4;

import java.util.Scanner;

public class C4EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter rectangle length ....");
        Scanner scanner = new Scanner(System.in);
        int rectLen = scanner.nextInt();
        System.out.println("Please enter rectangle width ....");
        int rectWidth = scanner.nextInt();

        System.out.println("Area:" + (rectLen*rectWidth));
        System.out.println("Scope:" + ((rectLen+rectWidth)*2));

        scanner.close();
    }
}
