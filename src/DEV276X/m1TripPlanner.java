package DEV276X;

import java.util.Scanner;

public class m1TripPlanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
        calcTimeBudget();
        calcTimeDifference();
        calcCountryArea();
        end();
    }

    public static void greeting() {
        System.out.println("Wellcome to Vacation Planner!");
        System.out.print("What is your name ? ");
        String travelerName = scanner.nextLine();
        System.out.format("Nice to meet you %s, Where are you travelling to  ? ", travelerName);
        String travelerDest = scanner.nextLine();
        System.out.format("Great! %s sounds like a great trip \n", travelerDest);
    }

    public static void calcTimeBudget() {
        System.out.print("How many days are you going to spend travelling ? ");
        int tripDays = scanner.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip ? ");
        double tripBudget = scanner.nextDouble();
        System.out.print("What is the tree letter currency symbol for your travel destination ? ");
        String currSymb = scanner.next().toUpperCase();
        System.out.format("How meny %s are there in 1 USD ? ", currSymb);
        float currExchgRate = scanner.nextFloat();

        System.out.format("If you are travelling for %d days, ", tripDays);
        System.out.format("it is the same as %d hours or %d minutes\n", tripDays * 24, tripDays * 24 * 60);

        System.out.format("If you are going to spend %-7.1f USD ", tripBudget);
        System.out.format("that means per day you can spend up to %-7.2f USD \n", tripBudget / tripDays);

        System.out.format("Your total budget in %s is %-7.1f %s ", currSymb, tripBudget * currExchgRate, currSymb);
        System.out.format("which per day is %-7.2f %s \n", tripBudget / tripDays * currExchgRate, currSymb);
    }

    public static void calcTimeDifference() {
        System.out.print("What is the time difference, in hours, between your home and your destination ? ");
        int timeDef = scanner.nextInt();
        System.out.format("That means that when it is midnight at home, it will be %d:00 \n", (timeDef > 0 ? timeDef : 24 + timeDef));
        System.out.format("and when it is noon at home it will be %d:00 \n",(timeDef+12));
    }

    public static void calcCountryArea() {
        double conversionFactor = 1.609344;
        System.out.print("What is the square area of your destination country in km2 ? ");
        double destSqrArea = scanner.nextDouble();
        System.out.format("In miles that is %7.1f \n",(destSqrArea/(conversionFactor*conversionFactor)));
    }

    public static void end() {
        System.out.println("Thanks for using Vacation Planner, Have a great vacation!");
        scanner.close();
    }
}

