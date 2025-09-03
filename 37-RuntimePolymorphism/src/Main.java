import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism -> when the method that gets
        // executed is decided at runtime based on actual type of object

        // Dog dog = new Dog();
        // Cat cat = new Cat();

        // dog.speak();
        // dog.speak();

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("would you like a Dog or Cat: ");
        String choice = scanner.next();

        if (choice.contains("Dog")) {
            animal = new Dog();
            animal.speak();
        } else if (choice.contains("Cat")) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("None");
        }

    }
}
