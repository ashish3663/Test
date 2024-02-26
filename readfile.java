import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingByteStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            // Specify the path of the file to read
            String filePath = "path_to_your_file.txt";
            
            // Create a FileInputStream with the specified file path
            inputStream = new FileInputStream(filePath);

            // Read bytes from the file until the end of file is reached
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                // Print the byte read (cast to char for readability)
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    // Close the FileInputStream
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
