import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CALCULATOR PROGRAM
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = false;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an Operator(+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by Zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperation = false;
                validOperation = true;
            }
        }

        if (validOperation) {
            System.out.println(result);
        }

        scanner.close();

    }
}
