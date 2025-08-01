// 'Car' class
public class Car {

    // these are attributes -> they are things which an Object has.
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58999.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You START the Engine, " + "isRunning : " + isRunning);
    }

    void stop() {
        isRunning = false;
        System.out.println("You STOP the Engine, " + "isRunning : " + isRunning);
    }

}
