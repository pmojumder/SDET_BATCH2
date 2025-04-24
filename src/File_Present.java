import java.io.File;
import java.io.IOException;

public class File_Present {
    public static void main(String[] args) {
        File file = new File("C:\\\\Users\\\\Plabani\\\\Documents\\\\MY\\\\testfile1.txt");

        // Checking if the file exists
       /* if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }*/
        // Creating a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


}
}