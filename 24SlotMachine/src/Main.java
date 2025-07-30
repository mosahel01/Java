import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols : 🍓 🍉 🍋 🍎 🥭 ");
        System.out.println("**********************");

        while (balance > 0) {
            System.out.println("Current Balance is : $" + balance);
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
            spinRow();
        }

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍓", "🍉", "🍋", "🍎", "🥭"};
        String[] row = new String[3];
        Random random = new Random();


        System.out.println(symbols[random.nextInt(symbols.length)]);

        return new String[0];
    }


}
