import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);


        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println(symbol + " ");
        }


        scanner.close();
    }
}
