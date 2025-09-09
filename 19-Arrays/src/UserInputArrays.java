import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number of food do you want? : ");
        int food_size = scanner.nextInt();
        scanner.nextLine();

        // String[] foods = {"pizza", "taco", "hamburger"};
        String[] foods = new String[food_size]; // empty array of length 3 initialised

        // User Input
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter food: ");
            foods[i] = scanner.nextLine();
        }

        // Hard Coded Input
        // foods[0] = "pizza";
        // foods[1] = "taco";
        // foods[2] = "hamburger";

        System.out.println();

        for (String food : foods) {
            System.out.println(food + ",");
        }

        scanner.close();
    }
}
