import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // we need to add a input method here to take inputs from the user
        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;
        int age;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You will get a senior + student discount of 30%");
                price *= 0.7;
            } else {
                System.out.println("You will get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You will get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("The price of the ticket is: $%.2f", price);

        //        System.out.println("Enter your age: ");
        //        age = scanner.nextInt();
        //
        //        System.out.println("Are you a student ? (true/false): ");
        //        isStudent = scanner.nextBoolean();
        //
        //
        //        if (age > 100 || age < 0) {
        //            System.out.println("Invalid age");
        //        } else if (isStudent) {
        //            if (age > 65) {
        //                System.out.println("You'll get a discount of 30%");
        //            } else {
        //                System.out.println("You'll get a discount of 10%");
        //
        //            }
        //        } else if (age > 65 && !isStudent) {
        //            System.out.println("You'll get a discount of 20%");
        //        } else {
        //            System.out.println("You'll get no discount");
        //        }

    }
}
