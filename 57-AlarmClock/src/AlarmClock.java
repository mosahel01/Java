import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println();
        System.out.println("*ALARM NOISES*");
        playSound();
    }

    private void playSound() {
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Enter to stop Alarm");
            scanner.nextLine();
            clip.stop();

            // Thread.sleep(10000);
            // closing scanner which was initiated in Main.java
            scanner.close();
        } catch (RuntimeException e) {
            System.out.println("Run Time Exception");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio File Exception");
        } catch (IOException e) {
            System.out.println("Input Output Exception");
        } catch (LineUnavailableException e) {
            System.out.println("Line Unavailable Exception");
        }

    }
}
