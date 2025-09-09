import java.util.Random;
import java.util.Scanner;

public class searchArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = {1, 6, 3, 4, 4, 8, 7, 2};
        int target = 13;
        String fruit;
        String[] fruits = {"Apple", "Orange", "Pineapple"};

        System.out.print("Enter the name of the fruit: ");
        fruit = scanner.nextLine();
        boolean isFound = false;


        for (int i = 0; i < numbers.length; i++) {
            //if (target == numbers[i]) {
            if (fruits[i].equals(fruit)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Not Found");
        }
        scanner.close();
    }
}
