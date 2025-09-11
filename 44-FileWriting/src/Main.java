import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        // How to write file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amount of text
        // PrintWriter = Best for structured Data, like reports or logs
        // FileOutputStream = Best for binary files (e.g : images, audio files)


        // Relative Path, Created within Java dir
        // try (FileWriter writer = new FileWriter("test.txt");) {

        // Absolute path
        // try (FileWriter writer = new FileWriter("/home/mos/Documents/mos.java");) {

        String FilePath = "/home/mos/Documents/Java/44-FileWriting/src/mos.txt";
        // String TextContent = "I like Pizza\nIt's really good";
        String TextContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE!
                """;

        // Intentional Error Catching
        try (FileWriter writer = new FileWriter(FilePath);) {
            writer.write(TextContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {       // Invalid File Path
            System.out.println("File path is invalid");
        } catch (IOException e) {                 // IOException -> input output exception
            System.out.println("Could not write File");
            // throw new RuntimeException(e);     // Throws traditional error message
        }


    }
}