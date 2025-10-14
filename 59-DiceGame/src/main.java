public class main {
    public static void main(String[] args) {

        // System.out.println("**DICE GAME**");
        // Random random = new Random();
        //
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("who is rolling the dice ? A or B : ");
        // String roll = scanner.nextLine().toUpperCase();
        //
        // double randomRoll1 = Math.round(Math.ceil(Math.random() * 6));
        // System.out.println(randomRoll1);
        //
        // String guy = "";
        //
        // switch (roll) {
        //     case "A":
        //         guy = "B";
        //         break;
        //     case "B":
        //         guy = "A";
        //         break;
        // }
        // System.out.print("Now, its your turn Mr." + guy + " ");
        // String secondRoll = scanner.nextLine().toUpperCase();
        // double secondRandomRoll = Math.round(Math.ceil(Math.random() * 6));
        //
        // System.out.println(secondRandomRoll);
        //
        // if (randomRoll1 > secondRandomRoll) {
        //     System.out.println("\nCONGRATULATIONS " + roll);
        // } else {
        //     System.out.println("\nCONGRATULATIONS " + secondRoll);
        // }

        int[][] lotteryCard = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lotteryCard[i][j]);
            }
        }

    }
}