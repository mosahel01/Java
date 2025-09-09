import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // Enhanced Switch = replacement for nested if-else statement hell
        // (Java 14 Features)


        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        day = scanner.nextLine();


        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> {
                System.out.printf("%s is not a valid day", day);

                scanner.close();
            }


        }
    }
}
