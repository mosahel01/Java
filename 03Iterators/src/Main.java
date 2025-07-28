import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name? :  ");
        name = scanner.nextLine();

        System.out.print("How old are you ?: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false) ");
        isStudent = scanner.nextBoolean();

        // Group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!  ");
        } else {
            System.out.println("Hello " + name + "!");
        }

        // Group 2
        if (age > 100) {
            System.out.println("You are probably dead");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age < 18) {
            System.out.println("You are not an adult");
        } else if (age > 65) {
            System.out.println("You are a senior");
        } else {
            System.out.println("You are an adult");
        }

        if (isStudent) {
           System.out.println("You are a Student");
        } else {
            System.out.println("You are not a student");
        }


        scanner.close();
    }
}
