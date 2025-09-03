public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // shape ro abstract method athy extend kr implementation details hide karni hov
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}
