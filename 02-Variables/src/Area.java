import java.util.Scanner;

public class Area {
    public static void main(String[] args) {


        // Calculate Area of a Rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width : ");
        width = scanner.nextDouble();

        System.out.print("Enter the height : ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Area of the rectangle is : " + area + "cm²");

        scanner.close();

    }
}
