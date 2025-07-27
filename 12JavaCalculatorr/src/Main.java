import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // CALCULATOR PROGRAM
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;


        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an Operator(+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();


        scanner.close();


    }
}