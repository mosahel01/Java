import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scan.nextLine();

        System.out.print("Enter a key: ");
        int key = scan.nextInt();
        scan.nextLine();

        char[] chars = text.toCharArray();
        String str = "";

        for (char c : chars) {
            c += key;
            System.out.print(c);
            str += c;
        }

        System.out.println();
        char[] strChar = str.toCharArray();

        System.out.print("Do you want to decrypt ? Y/N : ");
        String decryptInput = scan.next().toLowerCase();

        System.out.print("Enter a decryption key: ");
        int dkey = scan.nextInt();
        scan.nextLine();

        if (decryptInput.equals("y")) {
            for (char c : strChar) {
                c -= dkey;
                System.out.print(c);
            }
        } else if (decryptInput.equals("n")) {
            System.out.println("Thanks anyway");
        }

    }
}
