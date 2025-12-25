package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\DSA\\JavaProgramming\\src\\FileHandling\\note.txt");
        ) {
            int letters;
            while ((letters = fr.read()) != -1) {
                System.out.print((char) letters);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
