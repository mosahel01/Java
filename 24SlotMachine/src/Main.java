import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols : 🍓 🍉 🍋 🍎 🥭 💫");
        System.out.println("**********************");
        System.out.println("Your good brother");

        while (balance > 0) {
            System.out.println("\nCurrent Balance is : $" + balance);
            System.out.print("Place your bet : ");
            bet = scanner.nextInt();
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

        }

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍓", "🍉", "🍋", "🍎", "🥭"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
            System.out.print(row[i]);
        }

        return row;
    }

    static void printRow(String[] row) {

    }

}
