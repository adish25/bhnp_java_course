package LAB7;

import java.util.Scanner;

public class C7EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter a grade...");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        String gradeTxt;
        if (grade < 55) {
            gradeTxt = "Fail";
        } else if (grade >= 55 && grade <= 64) {
            gradeTxt = "B-";
        } else if (grade >= 65 && grade <= 74) {
            gradeTxt = "B+";
        } else if (grade >= 75 && grade <= 84) {
            gradeTxt = "A-";
        } else if (grade >= 85 && grade <= 94) {
            gradeTxt = "A";
        } else {
            gradeTxt = "A+";
        }

        System.out.println("Grage:" + gradeTxt);
    }
}
