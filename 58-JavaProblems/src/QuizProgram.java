import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = 0;
        String[] answers = {"c", "a", "b"};
        String[] response = {"", "", ""};

        System.out.println("What  is 2 + 2? ");
        System.out.println("a.) 2");
        System.out.println("b.) 3");
        System.out.println("c.) 4");
        System.out.println("d.) 5");

        System.out.println("What is the Capital of North Carolina? ");
        System.out.println("a.) Raleigh");
        System.out.println("b.) Durham");
        System.out.println("c.) Cary");
        System.out.println("d.) Winston-Salem");

        System.out.println("What  is 2 + 2? ");
        System.out.println("a.) Tiger");
        System.out.println("b.) Cheetah");
        System.out.println("c.) Giraffe");
        System.out.println("d.) Wolf");

        response[0] = scan.next().toUpperCase();
        response[1] = scan.next().toUpperCase();
        response[2] = scan.next().toUpperCase();

        for (int i = 0; i < answers.length; i++) {
            if (response[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.printf("Score: %d/%d", score, answers.length);

    }
}
