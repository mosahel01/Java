import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);
        int choice;
        double weight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            weight *= 0.453592;
            System.out.printf("Your new weight in kgs : %.2f", weight);
        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            weight *= 2.20462;
            System.out.printf("Your new weight in lbs : %.2f", weight);
        } else {
            System.out.println("Invalid Input, Retry");
        }
        scanner.close();
    }
}
