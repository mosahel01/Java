import java.awt.*;

void main() {
    // Alarm clock using Java
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    LocalTime alarmTime = null;
    // LocalTime alarmTime = null;
    String filePath = "GTA_San_Andreas_Theme_Song.wav";
    // String filePath = "A Caring Friend.wav";

    while (alarmTime == null) {
        try {
            System.out.print("Enter an alarm time (HH:MM:SS): ");
            String inputTime = scanner.nextLine();

            alarmTime = LocalTime.parse(inputTime, formatter);
            System.out.println("Alarm set for " + alarmTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Format. Please use HH:MM:SS");
        }
    }

    AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
    Thread alarmThread = new Thread(alarmClock);
    alarmThread.start();
}
