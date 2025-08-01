import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols : 🍓 🍉 🍋 🍎 🥭 💫");
        System.out.println("**********************");
        System.out.println("Your good brother");

        System.out.println("\nCurrent Balance is : $" + balance);

        while (balance > 0) {
            System.out.print("\nPlace your bet : ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Best must be greater than zero");
            } else {
                balance = balance - bet;
                System.out.println(balance);
            }
            System.out.println("Spinning...");

            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
                System.out.println();
            }
            System.out.print("Do you want to play again ? (Y/N) : ");
            playAgain = scanner.nextLine();
            // scanner.nextLine();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("GAME OVER! your final balance is $" + balance);

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = { "🍓", " 🍉", "🍋", "🍎", "🥭" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
            // System.out.print(row[i]);
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍓" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🍎" -> bet * 10;
                case "🥭" -> bet * 20;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍓" -> bet * 1;
                case "🍉" -> bet * 1;
                case "🍋" -> bet * 1;
                case "🍎" -> bet * 5;
                case "🥭" -> bet * 5;
                default -> 0;
            };
        } else if (row[0].equals(row[2])) {
            return switch (row[2]) {
                case "🍓" -> bet * 1;
                case "🍉" -> bet * 1;
                case "🍋" -> bet * 1;
                case "🍎" -> bet * 5;
                case "🥭" -> bet * 5;
                default -> 0;
            };
        }

        return 0;
    }

}
