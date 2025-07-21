import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        System.out.print("enter your cgpa: ");
        double cgpa = scanner.nextDouble();

        System.out.print("are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + "years old");
        System.out.println("Your cgpa is : " + cgpa);

        if (isStudent) {
            System.out.println("You are enrolled as a student!!");
        } else  {
            System.out.println("You are not enrolled ");
        }


        scanner.close();


    }
}
