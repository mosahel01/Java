import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DICE ROLLER PROGRAMME IN JAVA


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rolls = 4;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        rolls = scanner.nextInt();

        if (rolls > 0) {
            for (int i = 0; i < rolls; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
                PrintDie(roll);
                total = total + roll;
            }
            System.out.println("Total Rolls are " + total);
        } else {
            System.out.println("Invalid rolls, try again");
        }

        // [X]  DECLARE VARIABLES
        // [X]  NUMBER OF DICES FROM THE USER
        // CHECK IF # OF DICE > 0
        // ROLL ALL THE DICE
        // GET THE TOTAL / SUM
        // SHOW ASCII ART


        scanner.close();
    }

    static void PrintDie(int roll) {

        String Dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String Dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String Dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String Dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String Dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String Dice6 = """
                 --------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 --------
                """;

        switch (roll) {
            case 1 -> System.out.print(Dice1);
            case 2 -> System.out.print(Dice2);
            case 3 -> System.out.print(Dice3);
            case 4 -> System.out.print(Dice4);
            case 5 -> System.out.print(Dice5);
            case 6 -> System.out.print(Dice6);
            default -> System.out.println("Invalid Roll Number");
        }

    }

}

