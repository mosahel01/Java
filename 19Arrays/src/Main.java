import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Array = collection of values of the same data types
        // think of it as a variable that can store more than 1 value**

        // String fruit[] are correct too.
        String[] fruits = {"apple", "orange", "banana", "strawberry"};

        // fruit[0] = "pineapple";       // replace 'apple' with 'pineapple'

        Arrays.sort(fruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + ", \n");
        }

        // Enhanced for loop
        for (String fruit : fruits) { // fruit is same as i in the above for loop
            System.out.print(fruit + ", \n");
        }

        // System.out.println(fruit[0]);
        // System.out.println(fruit[1]);
        // System.out.println(fruit[2]);
        // System.out.println(fruit[3]);

    }
}

