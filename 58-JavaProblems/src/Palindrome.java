import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String original = scan.nextLine();
        findPalindrome(original);

    }

    public static void findPalindrome(String original) {

        String reverse = "";
        int palindromeCount = 0;

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                System.out.println("Palindrome: FALSE");
                break;
            } else {
                palindromeCount++;
            }
        }
        if (original.length() == palindromeCount) {
            System.out.println("Palindrome: TRUE");
        }
    }
}
