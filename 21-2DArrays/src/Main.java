public class Main {
    public static void main(String[] args) {

        // 2D = array where each element is an array too
        // think of it as matrix, array of array

        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meat = {"chicken", "beef", "mutton", "fish"};
        // String[][] groceries = {fruits, vegetables, meat};

        // this is same as above 4 lines
        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "beef", "mutton", "fish"}};

        groceries[2][3] = "eggs"; // 2 - row, 3 - columns

        for (String[] items : groceries) {
            System.out.println();
            for (String item : items) {
                System.out.print(item + " ");
            }
        }


    }
}