import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // ArrayList = A resizable objects that stores objects(autoboxing).
        //             Arrays are fixed in size but ArrayList can change.

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> fruits = new ArrayList<>();
        //
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        //
        // fruits.add("Orange");
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Coconut");
        // fruits.add("Zebra");
        // fruits.add("Elephant");
        //
        // fruits.remove(5);
        // fruits.remove("Zebra");
        //
        // fruits.set(0, "Pineapple");
        // System.out.println(fruits.get(2));
        //
        // Collections.sort(fruits);
        //
        // System.out.println(list);
        // System.out.println(fruits);


        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # of food you would like: ");
        int food = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < food; i++) {
            System.out.print("Enter food #" + (i + 1) + " ");
            String foodItem = scanner.nextLine();
            foods.add(foodItem);
        }

        System.out.println(foods);


    }
}