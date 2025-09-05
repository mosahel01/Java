/**
 * Car
 */
public class Car {

    private final String model; // readable with getters but no setters
    private String color; // readable-writable with getters-setters
    int price; // readable-writable

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getPrice() {
        if (price <= 0) {
            return "\nPrice can't be zero";
        } else {
            return "$" + this.price;
        }
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
