class Student {

    private String name = "John";
    private int age = 21;

    public void setName (String setName) {
        name = setName;
    }

    public void setAge (int age) {
        this.age = age;                                     // this keyword when (var name = para name)
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}

public class Encapsulation {

    public static void main (String[] args) {
        Student s = new Student();

        s.setName("Suzie");
        s.setAge(22);

        System.out.println("Age = " + s.getAge());
        System.out.println("Name = " + s.getName());

    }
}
