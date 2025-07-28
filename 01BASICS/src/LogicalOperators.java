import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {


        // username should be between 4-12 characters
        // username must not contain spaces or underscores


        Scanner scanner = new Scanner(System.in);

        String username;
        int lenUser;


        System.out.println("Enter an Username: ");
        username = scanner.nextLine();

        lenUser = username.length();


        if (lenUser > 12 || lenUser < 4) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains("_") || username.contains(" ")) {
            System.out.println("Username cannot contain space or underscore");
        } else {
            System.out.println("Welcome " + username);
        }

        scanner.close();

    }
}
