import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // audio player using Java (.wav supported)

        String filePath = "/home/mos/YungBleu.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Shall we play music? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.contains("yes")) {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                System.out.println("Let's go! Playing music...");

                // Keep the program running while audio plays
                System.out.println("Press Enter to stop...");
                scanner.nextLine();

                clip.stop();
                clip.close();
                audioStream.close();
                System.out.println("Playback stopped");

            } else if (response.contains("no")) {
                System.out.println("Okay, maybe next time!");
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'");
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format");
        } catch (IOException e) {
            System.out.println("File not found or unable to read file: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable: " + e.getMessage());
        }
    }
}
