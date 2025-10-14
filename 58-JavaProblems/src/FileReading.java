import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/NOTES.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";

        while (scan.hasNextLine()) {
            // System.out.println(scan.nextLine());
            // fileContent = fileContent + scan.nextLine();
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("/home/user/FileWriterJava.txt");
        writer.write(fileContent);
        writer.close();

    }
}
