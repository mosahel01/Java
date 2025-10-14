import java.util.LinkedList;
import java.util.Iterator;


public class LinkedLists {
    public static void main(String[] args) {


        // LinkedList

        LinkedList<String> cars = new LinkedList<>();

        cars.add("LinkedLists");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");

        Iterator it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}






