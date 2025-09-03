public class Main {
    public static void main(String[] args) {
        // toString -> Methods inherited from Object class
        // Used to return an string representation of an object
        // By default, it return a hash code as a unique identification
        // It can be overriden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car);

        // System.out.println(car.color);
        // System.out.println(car.year);
        // System.out.println(car.make);
        // System.out.println(car.model);

    }
}
