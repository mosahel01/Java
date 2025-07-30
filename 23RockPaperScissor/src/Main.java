import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] move = {"rock", "paper", "scissor"};

        String computerChoice;
        String playAgain;
        String playerChoice;

        do {
            computerChoice = move[random.nextInt(move.length)];

            System.out.print("Enter your move (rock, paper, scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            System.out.println("Computer choice : " + computerChoice);

            if (computerChoice.equals(playerChoice)) {
                System.out.println("DRAW");
            } else if (computerChoice.equals("rock") && playerChoice.equals("paper") ||
                    computerChoice.equals("scissor") && playerChoice.equals("rock") ||
                    computerChoice.equals("paper") && playerChoice.equals("scissor")) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }

            System.out.print("Play again? yes/no : ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));


        System.out.println("Thanks for playing");

        scanner.close();
    }
}