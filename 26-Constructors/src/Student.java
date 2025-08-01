public class Student {

    // Attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled = true; // not initialising -> sets default false

    Student(String naam, int umar, double natija) { // Student(params..) -> params are not necessary

        // most people usually keep parameter names same as attributes for readability
        // ie this.name = name;

        this.name = naam;
        this.age = umar;
        this.gpa = natija;
        // this.isEnrolled = dakhil;
    }

}
