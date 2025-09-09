import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // JAVA BANKING PROGRAM FOR BEGINNERS

        int choice;
        double balance = 110;
        boolean isRunning = true;

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
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    isRunning = false;
                }
                default -> System.out.println("invalid choice");
            }
        }

        System.out.println("**************************");
        System.out.println("Thank You! Have a Nice Day");
    }


    static void showBalance(double balance) {
        System.out.println();
        System.out.printf("\nYour Balance is : $%.2f\n", balance);
        System.out.println();
    }

    static double deposit() {
        System.out.println();
        System.out.println("Enter the amount to Deposit: ");
        double amount = scanner.nextDouble();
        System.out.println();
        if (amount < 0) {
            System.out.println();
            System.out.println("Amount can't be negative");
            System.out.println();
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.println();
        System.out.println("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        System.out.println();
        if (amount < 0) {
            System.out.println();
            System.out.println("Amount can't be negative");
            System.out.println();
            return 0;
        } else if (amount > balance) {
            System.out.println();
            System.out.println("INSUFFICIENT FUNDS");
            System.out.println();
            return 0;
        } else {
            return amount;
        }
    }


}