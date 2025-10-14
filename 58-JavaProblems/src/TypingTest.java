import java.util.Random;
import java.util.Scanner;

public class TypingTest {

    static String[] text = {"home", "water", "light", "dream", "walk", "stone", "after", "music", "clear", "heart", "find", "speak", "open", "quiet", "move", "earth", "build", "write", "truth", "green", "world", "strong", "carry", "beyond", "sweet", "hold", "voice", "above", "time", "run", "morning", "again", "shine", "deep", "river", "young", "follow", "wind", "stand", "blue", "wish", "start", "remember", "along", "look", "soft", "night", "hand", "great", "path", "stone", "between", "fire", "break", "live", "close", "kind", "bring", "peace", "feel", "free", "reach", "share", "through", "word", "face", "touch", "place", "still", "grow", "know", "move", "dream", "next", "sea", "rise", "light", "home", "hold", "heart", "before", "stand", "wait", "listen", "world", "open", "clear", "step", "smile", "try", "together", "turn", "hope", "stay", "change", "come", "start", "find", "again", "love"};

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter # of words : ");
        int wordInt = scan.nextInt();
        scan.nextLine();

        // Thread.sleep(1000);
        // System.out.println("3");
        // Thread.sleep(1000);
        // System.out.println("2");
        // Thread.sleep(1000);
        // System.out.println("1");

        String emptyStr = "";
        for (int i = 0; i < wordInt; i++) {
            int randomText = rand.nextInt(text.length);
            emptyStr += text[randomText] + " ";
        }
        System.out.println(emptyStr);

        long startTime = System.currentTimeMillis();
        String typedWords = scan.nextLine();

        long stopTime = System.currentTimeMillis();

        long time = (stopTime - startTime) / 1000;
        double wpm = ((double) typedWords.length() * 60) / time;
        if (time == 0) wpm = 0; // prevent divide-by-zero

        System.out.printf("Time:%2ds\n", time);
        System.out.printf("WPM: %.2f\n", wpm);

        scan.close();
    }
}
