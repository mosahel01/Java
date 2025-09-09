public class BreakContinue {
    public static void main(String[] args) {


        // Break - break out of a LOOP (STOP)
        // Continue - skip current iteration of a loop (SKIP)


        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;       // terminates for loop at i = 5;
                // continue; // skips for loop at i = 5; but continue later on
            }
            System.out.print(" " + i);
        }


    }
}
