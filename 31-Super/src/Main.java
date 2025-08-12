public class Main {

    public static void main(String[] args) {

        // Super -> refers to the parent class
        // Used in Methods Overriding and Constructors
        // Calls the Parents Constructor to initialise attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.5);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        student.showName();
        employee.showSalary();

        System.out.println(student.gpa + "gpa");

    }

}
