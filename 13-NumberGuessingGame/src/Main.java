import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Number guessing game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                                 // #1

        int guess;
        int randomNum = random.nextInt(1, 100);
        int attempts = 0;
        // int randomNum = (int) Math.floor(Math.random() * 100);      // #2 : alt to #1

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");

        do {
            System.out.println("-----------------------------");
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNum) {
                System.out.println("Too HIGH");
            } else if (guess < randomNum) {
                System.out.println("Too LOW");
            } else {
                System.out.println("You guessed it right: " + randomNum);
            }

        } while (guess != randomNum);


        scanner.close();
    }
}