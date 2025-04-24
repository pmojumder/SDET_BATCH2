import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String content = "Hello, this is a test file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Plabani\\Documents\\MY\\testfile.txt"))) {
            writer.write(content);
            writer.newLine(); // Adding a new line
            writer.write("This is another line.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
