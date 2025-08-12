public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa) {
        // cannot access Parents data
        // this.first = first;
        // this.last = last;

        // super -> where this won't work
        super(first, last);
        this.gpa = gpa;
    }

}
