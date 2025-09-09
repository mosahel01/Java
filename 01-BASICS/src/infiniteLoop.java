import java.util.Scanner;

public class infiniteLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a Game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the Game");


        scanner.close();


    }
}
