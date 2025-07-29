import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter you name: ");
        // String name = scanner.nextLine();
        // System.out.println();
        // //String name = "mos";
        // int age = 21;
        //
        // HappyBirthday(name, age);

        // double result = square(3);
        // double cubes = cube(3);
        // System.out.println(result);
        // System.out.println(cubes);

        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (ageCheck(age)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

        scanner.close();
    }

    // static before void as HappyBirthday() is called within static method.
    // Params can have different names from Args but should have the same order as Args
    // static void HappyBirthday(String naam, int umar) {
    static void HappyBirthday(String name, int age) {
        System.out.println("Happy Birthday to You");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy Birthday to You\n");
    }

    static double square(double num) {
        return num * num;
    }

    static double cube(double num) {
        return num * num * num;
    }


    static boolean ageCheck(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }


    }
}