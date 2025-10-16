class OtherClass {
    static void sayHi() {
        System.out.println("Hi");
    }

    void sayPancakes() {
        System.out.println("Pancakes");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Static Method : Class Itself
        OtherClass.sayHi();

        // Non-Static : Instance of the Class
        OtherClass m = new OtherClass();
        m.sayPancakes();
    }
}
