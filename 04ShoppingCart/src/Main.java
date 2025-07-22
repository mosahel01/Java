import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Shopping cart game

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        System.out.println("Hello there");

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
