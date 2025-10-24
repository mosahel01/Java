class Shoe {
    public final String brand;
    public final double size;

    Shoe (String brand, double size) {
        this.brand = brand;
        this.size = size;
    }
}

class Walking extends Shoe {
    final boolean goreTex = true;

    Walking (boolean goreTex, String brand, double size) {
        super(brand, size);
    }
}

class Running extends Shoe {
    public final double weight;

    Running (double weight, String brand, double size) {
        super(brand, size);
        this.weight = weight;
    }
}

public class MainShoe {
    public static void main (String[] args) {
        Running r1 = new Running(23.23, "Nike", 10);
        Walking w1 = new Walking(true, "gucci", 8.5);

        System.out.println(r1 instanceof Running);

        System.out.println(r1.brand + " - " + r1.size + " - " + r1.weight);
        System.out.println(w1.brand + " - " + w1.size + " - " + w1.goreTex);

    }
}