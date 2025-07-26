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
            System.out.println("Your new weight in kgs : " + weight);
        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            weight *= 2.20462;
            System.out.println("Your new weight in lbs : " + weight);
        } else {
            System.out.println("Enter a Valid Value");
        }


        System.out.println("Finished");
    }
}
