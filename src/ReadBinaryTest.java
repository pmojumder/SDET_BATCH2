import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBinaryTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Plabani\\Documents\\MY\\binary.dat")) {
            fos.write(65);  // Writing a single byte (A in ASCII)
            fos.write(66);  // Writing a single byte (B in ASCII)
            System.out.println("Binary data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Plabani\\\\Documents\\\\MY\\\\binary.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // Output: AB
            }
        } catch (IOException e) {
            e.printStackTrace();
}
    }
}