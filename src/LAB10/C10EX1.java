package LAB10;

import java.util.Scanner;

public class C10EX1 {
    public static void main(String[] args) {
        System.out.println("Please enter 100 numbers...");
        Scanner scanner = new Scanner(System.in);
        int numPrev = scanner.nextInt();
        int numCurr;
        boolean isSorted=true;
        for (int i = 0; i < 10-1; i++) {
            numCurr = scanner.nextInt();
            if (numCurr>=numPrev) {
                numPrev = numCurr;
                continue;
            }
            isSorted = false;
            break;
        }
        if (isSorted) {
            System.out.println("Sorted !!!");
        }
        else {
            System.out.println("Not Sorted !!!");
        }
        scanner.close();
    }
}
