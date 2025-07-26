import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // TEMPERATURE CONVERSION PROGRAM

        Scanner input = new Scanner(System.in);
        double temperature, newTemp;
        double C, F;
        String scale;

        System.out.print("Enter the temperature: ");
        temperature = input.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        scale = input.next().toUpperCase();        // method chaining

        newTemp = (scale.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5 + 32);

//        System.out.printf("newTemp + "°" + scale");
        System.out.printf("%.2f°%s", newTemp, scale);


        input.close();

    }
}