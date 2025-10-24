class Outside {
    int a = 0;

    class Inside {
        int b = 5;
    }

}

public class innerClass {
    public static void main(String[] args) {
        System.out.println("Hello there");
        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println(i);
    }
}
