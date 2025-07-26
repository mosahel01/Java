import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        // substring method / email slicer method
        Scanner scanner = new Scanner(System.in);
        String email, username, domain;

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.out.println("username = " + username);
            System.out.println("domain = " + domain);
        } else {
            System.out.println("Email must contain @ ");
        }

    }
}
