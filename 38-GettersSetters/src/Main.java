public class Main {
    public static void main(String[] args) {

        // GETTERS -> method that make a field READABLE if the class is private
        // SETTERS -> method that make a field WRITABLE

        Car car = new Car("Charger", "yellow", 10000);

        car.getModel();
        car.getPrice();
        car.setColor("blue");

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

    }
}
