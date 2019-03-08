-import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    // Change the next line to work in your project space!
    private static final String DIRECTORY = "/Users/athar.abdulquader/Downloads/Exceptions/src/";
    private static final String FILENAME = DIRECTORY + "java.jpeg";
    private static final String OUTPUT_FILE = DIRECTORY + "output.jpeg";

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream out = null;

        try {
            fis = new FileInputStream(FILENAME);
            out = new FileOutputStream(OUTPUT_FILE);

            int read;

            while ( (read = fis.read()) != -1) {
                out.write(read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
