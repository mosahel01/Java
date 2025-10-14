import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scan.nextLine().toLowerCase();

        // method 1
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphaCount = 0;

        for (int j = 0; j < alphabet.length(); j++) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == alphabet.charAt(j)) {
                    alphaCount++;
                    break;
                }
            }
        }
        System.out.println();
        if (alphaCount == 26) {
            System.out.println("Pangram: TRUE");
        } else {
            System.out.println("Pangram: FALSE");
        }
    }
}
