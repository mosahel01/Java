public class Triangle extends Shape {

    double base;
    double height;

    // constructor : not related with abstraction with using it to learn
    Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    // shape ro abstract method athy extend kr implementation details hide karni hov
    @Override
    double area() {
        return 0.5 * base * height;
    }

}
