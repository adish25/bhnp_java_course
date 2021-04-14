package DEV276X;

import java.util.Random;
import java.util.Scanner;

public class M2oddsAndEvens {
    private static Scanner scanner = new Scanner(System.in);

    private static char playerChoice;

    public static void main(String[] args) {
        gameIntro();
        playGame();
        end();
    }

    public static void gameIntro() {
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name ? ");
        String playerName = scanner.nextLine();
        System.out.format("Hi %s, which do you choose? (O)dds or (E)vens? ", playerName);
        playerChoice = scanner.next().toUpperCase().charAt(0);
        System.out.format("%s has picked %s! The computer will be %s. \n",
                playerName, (isEvens(playerChoice)?"evens":"odds"), (isEvens(playerChoice)?"odds":"evens"));
                //playerName, (playerChoice.equals("O")?"odds":"evens"), (playerChoice.equals("O")?"evens":"odds"));
        System.out.println(repeatChar('-',80));
    }

    public static void playGame() {
        System.out.format("How many “fingers” do you put out? (your choice is %s) ",(isEvens(playerChoice)?"evens":"odds"));
        int playerFingers = scanner.nextInt();
        Random rand = new Random();
        int computerFingers = rand.nextInt(6);
        System.out.format("The computer plays %d “fingers” \n", computerFingers);
        System.out.println(repeatChar('-',80));

        int sum = playerFingers+computerFingers;
        boolean isSumEvens = (sum%2==0?true:false);

        System.out.format("%d + %d = %d    <= it is %s \n", playerFingers,computerFingers,sum,
                (isSumEvens?"evenes":"odds"));
        System.out.format("That means %s wins!!! \n", (isSumEvens == isEvens(playerChoice)?"you":"computer"));
    }

    public static boolean isEvens(char ch) {
        return (ch==Character.valueOf('E')?true:false);
    }

    public static String repeatChar(char ch,int times) {
        String repeated="";
        for (int i = 0; i < times; i++) {
            repeated=repeated+ch;
        }
        return repeated;
    }

    public static void end() {
        System.out.println("Thanks for playing Odds and Evens!");
        scanner.close();
    }
}
