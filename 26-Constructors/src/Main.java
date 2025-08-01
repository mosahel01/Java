
public class Main {

    public static void main(String[] args) {

        // Constructor -> revising ? go here ->
        // https://www.w3schools.com/java/java_constructors.asp

        // Student myObj1 = new Student("Spongebob", 30, 8.2, true);
        // Student myObj2 = new Student("Mos", 21, 7.0, true);
        Student myObj1 = new Student("Spongebob", 30, 8.2);
        Student myObj2 = new Student("Mos", 21, 7.0);
        Student myObj3 = new Student("Sandy", 27, 9.0);

        System.out.print(myObj1.name + " ,");
        System.out.print(myObj1.age + " ,");
        System.out.print(myObj1.gpa + " ,");
        System.out.println(myObj1.isEnrolled);

        System.out.print(myObj2.name + " ,");
        System.out.print(myObj2.age + " ,");
        System.out.print(myObj2.gpa + " ,");
        System.out.println(myObj2.isEnrolled);

        System.out.print(myObj3.name + " ,");
        System.out.print(myObj3.age + " ,");
        System.out.print(myObj3.gpa + " ,");
        System.out.println(myObj3.isEnrolled);
    }

}
