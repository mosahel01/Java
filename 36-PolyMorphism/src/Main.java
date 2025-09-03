public class Main {
    public static void main(String[] args) {

        // Polymorphism -> "POLY" = many
        // "MORPH" = shape
        // Object can identify as other objects
        // Objects can treated as objects of common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // Car[] cars = {car, bike, boat}; // bike, boat cannot be converted to Car
        // Bike[] cars = {car, bike, boat}; // car, boat cannot be converted to Bike
        // Boat[] cars = {car, bike, boat}; // bike, car cannot be converted to Boat

        Vehicle[] vehicles = { car, bike, boat };

        // System.out.println(vehicles[].class);
        // System.out.println(Arrays.toString(vehicles));
        // System.out.println(vehicles);

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        // for (int i = 0; i < vehicles.length; i++) {
        // System.out.println(vehicles[i] + " ");
        // }

        // System.out.println(car.go());
        // System.out.println(bike);
        // System.out.println(boat.go());

    }
}
