import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Compound interest calculator [astagfirullah]
        Scanner scanner = new Scanner(System.in);

        double principal;        // initial money we have
        double rate;             // interest rate on principal
        double amount;           // total amount in the end
        int timesCompounded;     // n = 1 or n = years, if its compounded once a year
        int years;               // number of years investment/loan is held

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

        System.out.printf("The amount after %d year would be $%.2f", years, amount);

        scanner.close();
    }
}

