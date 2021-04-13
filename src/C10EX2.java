import java.util.Scanner;

public class C10EX2 {
    public static void main(String[] args) {
        System.out.println("Please enter 1000 numbers...");
        Scanner scanner = new Scanner(System.in);
        int num, i = 0;
        int sum = 0;
        boolean isFound = false;
        do {
            i++;
            num = scanner.nextInt();
            if (sum == num) {
                isFound = true;
                break;
            }
            sum += num;
        } while (i < 10);
        if (isFound) {
            System.out.println("Found !!!");
        } else {
            System.out.println("Not Found !!!");
        }
        scanner.close();
    }
}
