public class Employee extends Person {

    int salary;

    Employee(String first, String last, int salary) {
        // this.first = first;
        // this.last = last;
        // Employee -> Person so we need super() to pass arguments
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is " + salary);
    }

}
