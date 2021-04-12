package LAB9;

import java.util.Random;

public class C9EX12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num, j = 0;
        for (int i = 0; i < 100; i++) {
            num = rand.nextInt(100);
            if (num % 2 == 0) {
                System.out.print(num + " ");
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
