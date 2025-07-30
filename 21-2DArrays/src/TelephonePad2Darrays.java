public class TelephonePad2Darrays {
    public static void main(String[] args) {

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] row : telephone) {
            System.out.println();
            for (char columns : row) {
                System.out.print(columns + "    ");
            }
        }


    }
}
