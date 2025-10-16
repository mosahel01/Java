interface WaterBottle {
    String color = "blue";

    void fillUP();
}

public class InterfaceExamples implements WaterBottle {
    public static void main(String[] args) {
        InterfaceExamples wb = new InterfaceExamples();
        wb.fillUP();
    }

    public void fillUP() {
        System.out.println("Water bottle is filled up");
        System.out.println(color);
    }
}
