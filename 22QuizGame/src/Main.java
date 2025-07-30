import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java Quiz Game

        String[] questions = {
                "What is the main function of a router ? ",
                "Which part of the computer is considered the RAM ? ",
                "What year was facebook launched ? ",
                "Who is known as the father of computers ? ",
                "What was the first programming language ? "
        };

        String[][] options = {
                {"1. storing files", "2. encrypting data", "3. directing internet traffic", "4. managing passwords"},
                {"1. CPU", "2. hard drive", "3. ram", "4. gpu"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. steve jobs", "2. bill gates", "3. alan turing", "4. charles babbage"},
                {"1. cobol", "2. c", "3. fortran", "4. assembly"},
        };

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");


        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n"+questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("\nEnter your guess : ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                score++;
            } else {
                System.out.println("*****");
                System.out.println("WRONG");
                System.out.println("*****");
            }
        }

        System.out.println("Your score will be " + score + " out of " + questions.length);


        scanner.close();
    }
}