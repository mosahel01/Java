import java.util.ArrayList;
import java.util.Scanner;

public class PangramPart2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scan.nextLine().toLowerCase().toLowerCase();

        ArrayList<Character> chars = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                if (!chars.contains(input.charAt(i))) {
                    if (!(input.charAt(i) == ' ')) {
                        chars.add(input.charAt(i));
                        count++;
                    }
                }
            }
        }
        if (chars.size() == 26) System.out.println("\nPangram: TRUE");
        System.out.println("\nPangram: FALSE");
    }
}
