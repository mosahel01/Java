import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputStr = scan.nextLine();

        String r = reverse(inputStr);
        System.out.println(r);

        scan.close();
    }

    public static String reverse(String s) {

        char[] letters = new char[s.length()];
        int letterInt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterInt] += s.charAt(i);
            letterInt++;
        }

        String reverse = "";

        for (int i = 0; i < letters.length; i++) {
            reverse = reverse + letters[i];
        }

        return reverse;
    }
}
