package DEV276X.M4MazeRunner;

import java.util.Scanner;

public class MazeRunner {

    private static Scanner scanner = new Scanner(System.in);

    private static Maze myMap = new Maze();

    public static void main(String[] args) {

        boolean go = true;

        int moves = 0;

        intro();

        while (go && (moves < 100)) {

            switch (userMove()) {
                case "R":
                    moveRight();
                    break;
                case "L":
                    moveLeft();
                    break;
                case "U":
                    moveUp();
                    break;
                case "D":
                    moveDown();
                    break;
                case "X":
                    go = false;
                    break;
                default:
                    break;
            }

            movesMessage(moves++);

            if (myMap.didIWin()) {
                System.out.println(getMessage(999));
                System.out.format("and you did it in %d moves\n", moves);
                go = false;
            }
        }

        end();

    }

    private static void moveRight() {

        System.out.println("right");
        if (myMap.canIMoveRight()) {
            myMap.moveRight();
            myMap.printMap();
        } else if (myMap.isThereAPit("R")) {
            navigatePit("R");
        } else {
            System.out.println(getMessage(101));
        }
    }

    private static void moveLeft() {

        System.out.println("left");
        if (myMap.canIMoveLeft()) {
            myMap.moveLeft();
            myMap.printMap();
        } else if (myMap.isThereAPit("L")) {
            navigatePit("L");
        } else {
            System.out.println(getMessage(101));
        }
    }

    private static void moveUp() {

        System.out.println("up");
        if (myMap.canIMoveUp()) {
            myMap.moveUp();
            myMap.printMap();
        } else if (myMap.isThereAPit("U")) {
            navigatePit("U");
        } else {
            System.out.println(getMessage(101));
        }
    }

    private static void moveDown() {
        System.out.println("down");
        if (myMap.canIMoveDown()) {
            myMap.moveDown();
            myMap.printMap();
        } else if (myMap.isThereAPit("D")) {
            navigatePit("D");
        } else {
            System.out.println(getMessage(101));
        }
    }

    public static void navigatePit(String dir) {
        System.out.print("Watch out! There's a pit ahead, jump it?");
        String ans = scanner.next();
        if (ans.substring(0, 1).compareTo("y") == 0) {
            System.out.println("jump");
            myMap.jumpOverPit(dir);
            myMap.printMap();
        }
    }

    public static String userMove() {
        String direction = "";
        System.out.print("Where would you like to move? (R, L, U, D)");
        direction = scanner.next();
        while (!direction.matches("(?i)r|l|u|d|x")) {
            System.out.println("Sorry, wrong direction, enter only (R, L, U, D) ");
            direction = scanner.next();
        }
        return direction.toUpperCase();
    }

    public static void movesMessage(int moves) {

        switch (moves) {
            case 50:
                System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
                return;

            case 75:
                System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
                return;

            case 90:
                System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
                return;

            case 100:
                System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
                System.out.println("Sorry, but you didn't escape in time- you lose!");
                return;

            default:
                return;
        }
    }

    public static String getMessage(int msgId) {
        switch (msgId) {
            case 101:
                return "Sorry, you’ve hit a wall.";
            case 999:
                return "Congratulations, you made it out alive!";
            default:
                return "Unknown message";
        }
    }

    private static void intro() {
        System.out.println("Wellcome to Maze Runner");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static void end() {
        System.out.println("Thanks for using Maze Runner");
        scanner.close();
    }
}
