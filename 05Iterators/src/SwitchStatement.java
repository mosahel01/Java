import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // Enhanced Switch = replacement for nested if-else statement hell
        // (Java 14 Features)


        String day;
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextLine();


        switch (day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend, yay!!");
            case "Sunday" -> System.out.println("It is a weekend, yay!!");
            default -> System.out.printf("%s is not a valid day", day);
        }


//        // This is nested if-else hell
//        if (day.equals("Monday")) {
//            System.out.println("It is a weekday");
//        } else if (day.equals("Tuesday")) {
//            System.out.println("It is a weekday");
//        } else if (day.equals("Wednesday")) {
//            System.out.println("It is a weekday");
//        } else if (day.equals("Thursday")) {
//            System.out.println("It is a weekday");
//        } else if (day.equals("Saturday")) {
//            System.out.println("It is a weekday");
//        } else if (day.equals("Sunday")) {
//            System.out.println("It is a weekday");
//        } else {
//            System.out.printf("%s is not a valid day", day);
//        }

        scanner.close();


    }
}
