import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse (side c) is: " + c + "cm");

        scanner.close();
    }
}
