import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary Operators");


//         variable = (condition) ? ifTrue : ifFalse;


        int score = 70;

        // Method I
        String scorePF = (score > 60) ? "Pass" : "Fail";
        System.out.println(scorePF);

        // Method II
        // if (score > 60) {
        //     System.out.println("Pass");
        // } else {
        //     System.out.println("Fail");
        // }

        // Odd / Even Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        String evenORodd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenORodd);
        scanner.close();
    }
}
