import java.util.*;

public class Main {

    static ArrayList<Integer> userPosition = new ArrayList<Integer>();
    static ArrayList<Integer> machinePosition = new ArrayList<Integer>();

    public static void main (String[] args) {

        char[][] charboard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printGameBoard(charboard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();

            System.out.print("Enter your position (1-9) : ");
            int position = scan.nextInt();

            while (userPosition.contains(position) || machinePosition.contains(position)) {
                System.out.print("Position Taken, Try again : ");
                position = scan.nextInt();
            }

            placePiece(charboard, position, "user");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            int randPosition = rand.nextInt(9) + 1;
            while (userPosition.contains(randPosition) || machinePosition.contains(randPosition)) {
                randPosition = rand.nextInt(9) + 1;
            }

            placePiece(charboard, randPosition, "machine");

            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            printGameBoard(charboard);
        }
    }

    public static void printGameBoard (char[][] charboard) {
        for (char[] row : charboard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece (char[][] charboard, int position, String user) {
        char symbol = 'X';
        if (user.equals("user")) {
            symbol = 'X';
            userPosition.add(position);
        } else if (user.equals("machine")) {
            symbol = 'O';
            machinePosition.add(position);
        }
        switch (position) {
            case 1 -> charboard[0][0] = symbol;
            case 2 -> charboard[0][2] = symbol;
            case 3 -> charboard[0][4] = symbol;
            case 4 -> charboard[2][0] = symbol;
            case 5 -> charboard[2][2] = symbol;
            case 6 -> charboard[2][4] = symbol;
            case 7 -> charboard[4][0] = symbol;
            case 8 -> charboard[4][2] = symbol;
            case 9 -> charboard[4][4] = symbol;
        }
    }

    public static String checkWinner () {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List topColumn = Arrays.asList(1, 4, 7);
        List midColumn = Arrays.asList(2, 5, 8);
        List bottomColumn = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();

        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(topColumn);
        winning.add(midColumn);
        winning.add(bottomColumn);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (userPosition.containsAll(l)) {
                return "Congrats, you won!";
            } else if (machinePosition.containsAll(l)) {
                return "Sorry, you loose!";
            } else if (userPosition.size() + machinePosition.size() == 9) {
                return "\nTIE\n";
            }
        }
        return "";
    }
}


