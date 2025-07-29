public class Main {
    public static void main(String[] args) {
        // Overloaded Methods
        // Methods that share the same name but different Parameters


        System.out.println(add(1, 3, 5));
        System.out.println(add(1, 4));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }


}