
public class Main {
    public static void main(String[] args) {
        // Objects : An entity that holds data (Attributes)
        // that can perform Actions (Methods)
        // it is a Reference data type

        // Car -> Object
        // Weight -> Attribute
        // Drive -> Method

        // Car is an Object with weight/colour as attribute and drive/brake as methods

        // Mos -> Class
        // myObj1 -> Object
        // Line20 -> Method
        // new Main() -> initialises new object

        // public class Mos {
        // int x = 5;
        // public static void main(String[] args) {
        // Mos myObj1 = new Main(); // Object 1
        // Mos myObj2 = new Main(); // Object 2
        // System.out.println(myObj1.x);
        // System.out.println(myObj2.x);
        // }
        // }

        // Reference Car.java
        Car gadi = new Car();

        System.out.println(gadi);
        // since 'gadi' is a object, objects are reference data type
        // so its wont print output but memory address

        System.out.println("model: " + gadi.model);
        System.out.println("year: " + gadi.year);
        System.out.println("isRunning: " + gadi.isRunning);
        System.out.println("price: " + gadi.price);
        System.out.println("make: " + gadi.make);
        // accessing data attribute

        gadi.isRunning = true;
        System.out.println("modified isRunning: " + gadi.isRunning);

        gadi.start();
        gadi.stop();

    }
}
