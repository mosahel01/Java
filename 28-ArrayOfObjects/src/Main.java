public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "white");
        Car car3 = new Car("Charger", "White");

        car1.drive();
        car2.drive();
        car3.drive();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Car[] car = new Car[3]; // empty array of cars
        Car[] cars = { car1, car2, car3 }; // hard coded array

        for (Car car : cars) {
            car.colour = "purple";
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

    }

}
