class Bird {
    // everything inside a Class is Variables and Methods
    // every Object has properties and things it can do

    public void sing () {
        System.out.println("tweet tweet tweet ");
    }

}

class Robin extends Bird {
    public void sing () {
        System.out.println("twiddledeedee");
    }
}

class Pelican extends Bird {
    public void sing () {
        System.out.println("KWAH KWAHAH KWAH");
    }
}

public class Polymorphism {
    public static void main (String[] args) {
        Pelican p = new Pelican();
        Robin r = new Robin();
        Bird b = new Bird();

        r.sing();
        b.sing();
        p.sing();
    }
}
