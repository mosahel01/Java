public class Main {

    public static void main(String[] args) {

        // Method Overriding -> when a subclass provides its own implementation
        // of a method rather than using what's inherited from its parent
        // Allows code reusability and give specific implementations

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
