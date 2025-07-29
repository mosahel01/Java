import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // JAVA BANKING PROGRAM FOR BEGINNERS
        Scanner scanner = new Scanner(System.in);

        int choice;
        double balance = 0;
        boolean isRunning;

        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance();
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice");
            }

        }


        //if (choice == 2 || choice == 3 || choice == 4) {
        //    System.out.println("Enter an amount to " + choice + " : ");
        //    System.out.println("Now you have " + amount + " remained");
        //} else if (choice == 1) {
        //    System.out.println("You have " + balance + " amount");
        //}
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }


}