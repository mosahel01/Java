public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello and welcome!");

        // Interfaces : https://www.w3schools.com/java/java_interface.asp
        //
        //
        //
        // Like abstract classes, interfaces cannot be used to create objects (in the
        // example above, it is not possible to create an "Animal" object in the
        // MyMainClass) Interface methods do not have a body - the body is provided by
        // the "implement" class On implementation of an interface, you must override
        // all of its methods Interface methods are by default abstract and public
        // Interface attributes are by default public, static and final An interface
        // cannot contain a constructor (as it cannot be used to create objects)

        Bear bear = new Bear();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        bear.flee(); // sometimes check if class.method() >> sout..
        // System.out.println(bear.flee());

        hawk.hunt();

        fish.flee();
        fish.hunt();

    }

}
