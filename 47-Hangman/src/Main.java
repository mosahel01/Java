import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Hangman Game

        String word = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        System.out.println(wordState);

        System.out.println("*************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("*************************");

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        while (wrongGuess < 6) {

            System.out.print("\nWord: ");

            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println("You won!");
                    System.out.println("The word was : " + word);
                    break;
                }
            } else {
                System.out.println("Wrong guess");
                wrongGuess++;
            }

            System.out.println(getHangmanArt(wrongGuess));
        }

        if (wrongGuess >= 6) {
            System.out.println("Game Over!");
            System.out.println("The word was : " + word);
        }


        // scanner.close();
    }

    static String getHangmanArt(int wrongGuess) {


        return switch (wrongGuess) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    o
                    
                    
                    """;
            case 2 -> """
                     o
                     |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o 
                    /|\\                    
                    
                    """;
            case 5 -> """
                     o 
                    /|\\                    
                    /
                    """;
            case 6 -> """
                     o 
                    /|\\                    
                    / \\
                    """;
            default -> "";
        };


    }
}
