import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
        // String methods


        String name = "Bro Code";
        String password = "BroCode";
        String empty = "";
        int length = name.length();
        char charOF = name.charAt(0);
        int indexOF = name.indexOf("o");
        int LastIndexOF = name.lastIndexOf("o");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("o", "a"));
        System.out.println(length);
        System.out.println(charOF);
        System.out.println(indexOF);
        System.out.println(LastIndexOF);

        System.out.println(empty.isEmpty()); // true on "" , false on " "

        if (name.contains(" ")) {
            System.out.println("Your name contains spaces");
        } else {
            System.out.println("Your name does not contain spaces");
        }

        if (password.equals(name)) {
            System.out.println("You name is a password");
        } else {
            System.out.println("Your name is not a password");
        }


    }
}
