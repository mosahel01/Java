public class Main {
    public static void main(String[] args) {

        // Wrapper classes == Allow primitive values (int, char, double, boolean)
        //                    to be used as objects. "Wrap them in an ojbect"
        //                    General, don't wrap primitives unless you need an object
        //                    Allows use of Collections Frameworks and static Utility Methods.


        // Autoboxing
        // Integer a = new Integer(6969);
        // Double b = new Double(3.14);
        // Character c = new Character("$");
        // Boolean d = new Boolean(true);
        // String e = new String("Pizza");

        // Integer a = 6969;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        // String e = new String("Pizza");

        // // Unboxing
        // int u = a;
        // double v = b;
        // char x = c;
        // boolean y = d;
        // String z = e;


        // Integer myInt = 4;
        // System.out.println(myInt);

        char x = 'b';

        System.out.println(Character.isLetter(x));
        System.out.println(Character.isUpperCase(x));


    }
}