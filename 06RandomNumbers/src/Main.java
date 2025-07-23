import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random Numbers");

        Random random = new Random();

        int num1;
        int num2;
        int num3;
        boolean isHeads;

        num1 = random.nextInt(1, 11);
        num2 = random.nextInt(1, 11);
        num3 = random.nextInt(1, 11);
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}