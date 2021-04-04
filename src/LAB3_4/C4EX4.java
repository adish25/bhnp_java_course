package LAB3_4;

import java.util.Scanner;

public class C4EX4 {
    public static void main(String[] args) {
        System.out.println("Please enter movie lenght in minutes ....");
        Scanner scanner = new Scanner(System.in);
        int movieLen = scanner.nextInt();
        int movieHH = movieLen/60;
        int movieMN = movieLen%60;
        System.out.println("Movie lenght:" + movieHH + " hours and " + movieMN + " minutes.");
        scanner.close();

    }
}
