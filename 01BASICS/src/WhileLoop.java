import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String name = "";

        // be cautious of infinite loops with while loop
        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();

    }
}
