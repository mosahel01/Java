public class Main {
    public static void main(String[] args) {

        // Abstraction -> hiding implementation details
        // only showing essential features

        // Shape shape = new Shape(); abstract class cannot be instanciated this way

        Triangle triangle = new Triangle(2, 2);
        Circle circle = new Circle(3);

        System.out.println(circle.area());
        System.out.println(triangle.area());

    }
}
