import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Plabani\\Documents\\MY\\testfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//FileReader is used to read characters from a file.
//BufferedReader is used to read text line by line, which is efficient for reading large files.
