import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Main {

    private Clip clip;
    private Scanner scanner;

    {
        scanner = new Scanner(System.in);
    }

    private Main(File f) {
        try {
            prepare(f);
            ask("");
        } catch (Exception _) {
        }
    }

    private void ask(String r) {
        while (!r.equals("Q")) {
            print("P -> Play");
            print("S -> Stop");
            print("R -> Reset");
            print("Q -> Quit");
            print("Enter your choice ");
            r = scanner.next().toUpperCase();

            switch (r) {
                case "P" -> play();
                case "S" -> stop();
                case "R" -> reset(0);
                case "Q" -> stop();
                default -> print("could not locate file");
            }
        }
    }

    private void prepare(File f) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(f));
        } catch (Exception _) {
        }
    }

    private void play() {
        clip.start();
    }

    private void stop() {
        clip.close();
    }

    private void reset(final int postion) {
        clip.setMicrosecondPosition(postion);
    }

    private void print(final String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        //	new Main(new File("Your music"));
        new Main(new File("/home/user/Documents/Java/46-AudioPlayer/resources/GTA_San_Andreas_Theme_Song.wav"));
    }
}