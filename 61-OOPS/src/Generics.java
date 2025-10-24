class GenericsExample<T> {
    T something;

    public GenericsExample (T something) {
        this.something = something;
    }

    public void print () {
        System.out.println(something);
    }
}


public class Generics {
    public static void main (String[] args) {
        GenericsExample<String> genStr = new GenericsExample<>("how you doin? ");
        GenericsExample<Integer> genInt = new GenericsExample<>(99);
        GenericsExample<Boolean> genBool = new GenericsExample<>(true);
        genInt.print();
        genStr.print();
        genBool.print();
    }
}
