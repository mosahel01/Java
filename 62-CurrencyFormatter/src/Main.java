import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a amount : ");
        double amount = scan.nextDouble();
        scan.nextLine();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(amount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("France: " + france);
        System.out.println("China: " + china);

    }
}