import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// Exception-Handling = An event that interrupts the normal flow of a program
//                     (dividing by zero, file not found, mismatch input type)
//                     surround any dangerous code with a try{} block
//                     try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by Zero");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        } catch (Exception e) {
            System.out.println("Catching all Exceptions at once");
        } finally {
            System.out.println("This always executes");
        }


    }
}