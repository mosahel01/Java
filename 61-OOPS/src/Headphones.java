class HeadSets {
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color = "Red/Black";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn() {
        power = true;
        System.out.println("power " + power);
    }

    public static void powerOff() {
        power = false;
        System.out.println("power " + power);
    }

    public static void volumeUp() {
        volume++;
        System.out.println("volume " + volume);
    }

    public static void volumeDown() {
        volume--;
        System.out.println("volume " + volume);
    }
}

public class Headphones {
    public static void main(String[] args) {
        // HeadSets heads = new HeadSets();
        HeadSets.powerOff();
        HeadSets.powerOn();
        HeadSets.volumeUp();
        HeadSets.volumeDown();
    }
}
