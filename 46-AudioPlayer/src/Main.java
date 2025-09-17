import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // audio player using Java (.wav supported)

        String filePath = "/home/mos/Downloads/Hass_Hass.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);) {

            String response = "";

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Method-I

            while (!response.equals("Q")) {

                System.out.println("Q = Quit");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");

                System.out.print("Enter your choice : ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "Q" -> clip.close();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "S" -> clip.stop();
                    default -> System.out.println("Oops, invalid choice");
                }
            }


            // Method-II

            // System.out.println("Shall we play music? (yes/no): ");
            // String response = scanner.nextLine().toLowerCase();
            //
            // if (response.contains("yes")) {
            //     Clip clip = AudioSystem.getClip();
            //     clip.open(audioStream);
            //     clip.start();
            //     System.out.println("Let's go! Playing music...");
            //
            //     // Keep the program running while audio plays
            //     System.out.println("Press Enter to stop...");
            //     scanner.nextLine();
            //
            //     clip.stop();
            //     clip.close();
            //     audioStream.close();
            //     System.out.println("Playback stopped");
            //
            // } else if (response.contains("no")) {
            //     System.out.println("Okay, maybe next time!");
            // } else {
            //     System.out.println("Invalid response. Please answer 'yes' or 'no'");
            // }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format");
        } catch (IOException e) {
            System.out.println("File not found or unable to read file: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable: " + e.getMessage());
        } finally {
            System.out.println("Bye!");
        }
    }
}
