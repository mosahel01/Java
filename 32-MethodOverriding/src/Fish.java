public class Fish extends Animal {

    // method overriding -> fish do not run so we are changing that here

    @Override // provides type checking for Overridde methods
    void move() {
        System.out.println("The Animal is Swimming");
    }

}
