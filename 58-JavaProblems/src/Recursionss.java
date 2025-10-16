public class Recursionss {

    public static void main(String[] args) {
        sayHi(5);
    }

    public static void sayHi(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            sayHi(n);
        }
    }
}
