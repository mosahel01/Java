import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // circumference = 2 * Math.PI * Radius
        // area = Math.PI * Math.pow(radius, 2)
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double volume;
        double area;
        double circumference;

        System.out.print("Enter the radius : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("circumference = " + circumference + "cm");
        System.out.println("area = " + area + "cm²");
        System.out.println("volume = " + volume + "cm³");

        // %.1 => will keep 1 value after decimal
        System.out.printf("------------------------");
        System.out.printf("circumference = %.1fcm\n", circumference);
        System.out.printf("area = %.1fcm²\n", area);
        System.out.printf("volume = %.1fcm³", volume);
        System.out.printf("------------------------");

        // System.out.printf("Hello There")

        scanner.close();
    }
}
