public class Main {
    public static void main(String[] args) {

        // Inheritance -> one class inherits the
        // attributes and methods from another class
        // Child <- Parent <- Grandparent

        // Organism -> Animal & Plants
        // Animal -> Dog & Cat
        // NOTE: : Animal & Plants aren't directly
        // related but one of the childs of Organism.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plant = new Plants();

        dog.Eat();
        cat.Eat();

        dog.speak();
        cat.speak();
        plant.Photosynthesis();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        System.out.println("Dog is Alive : " + dog.isAlive);
        System.out.println("Cat is Alive : " + cat.isAlive);
        System.out.println("Plant is Alive: " + plant.isAlive);

    }
}
