import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Do While LOOP
        Scanner scanner = new Scanner(System.in);

        String response = "";

        // Do runs code then while checks for condition
        do {
            System.out.println("You are playing a Game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();

        } while (!response.equals("Q"));

        System.out.println("You have quit the Game");


        scanner.close();
    }
}
