
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Loops - execute some code for certain amount of time

        // FOR loop => ( initialisation/initial value, when do we want to stop , change initial value by some method )

//        for (int i = 0; i < 20; i = i + 2) {
//            // System.out.println("Pizza");
//            System.out.print(" " + i);
//        }


        int start = 10;

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy Birthday 2u");


    }
}