class ShirtClass {

    private String color;
    private char size;

    void putOn() {
        System.out.println("Shirt is on");
    }

    void takeOff() {
        System.out.println("Shirt is off");
    }
}

public class Shirt {

    public static void main(String[] args) {
        ShirtClass s = new ShirtClass();
        s.putOn();
        s.takeOff();
    }

}
