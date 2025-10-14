package CollectionsFramework;

public class ArrayLists {
    public static void main(String[] args) {

        String[] fruits = new String[4];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Watermelon";
        fruits[3] = "Pineapple";

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        System.out.println(fruits);
    }
}
