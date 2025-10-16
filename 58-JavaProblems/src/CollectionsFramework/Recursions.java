package CollectionsFramework;

public class Recursions {
    public static void main(String[] args) {
        System.out.println("Hola socio");
        sayHi(2);
    }

    public static void sayHi(int n) {
        // System.out.println("HI");
        // sayHi(10);
        if (n == 0) {
            System.out.println("Done");
        } else {
            System.out.println("HI");
            n--;
            sayHi(n);
        }
    }
}
