public class Main {
    public static void main(String[] args) {

        // Composition -> Represent "part-of" relationship between objects
        // Also, when an Object is composed of another Object
        // For example, an Engine is a "part-of" a Car.
        // Allowing complex objects to be created from smaller objects.

        System.out.println("Hello world");

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);      // type is to engine is engine to car

        // car.engine.start();
        car.start();

    }
}
