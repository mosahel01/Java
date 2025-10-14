package CollectionsFramework;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");

        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.toArray()[i]);
        }
    }
}
