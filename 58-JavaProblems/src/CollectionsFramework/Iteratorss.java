package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteratorss {
    public static void main(String[] args) {

        // iterator works with collections ArrayList, HashMap, HashSet, LinkedList etc
        LinkedList<String> foods = new LinkedList<>();

        foods.add("BMW");
        foods.add("Volvo");
        foods.add("Tesla");
        foods.add("Ford");
        foods.add("Toyota");
        foods.add("Lexus");

        // Iteraors<> iterators = new Iterator();
        Iterator<String> it = foods.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
