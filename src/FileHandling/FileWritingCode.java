package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingCode {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("D:\\DSA\\JavaProgramming\\src\\FileHandling\\note.txt", true)){
            fw.write("I am Anshu");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\DSA\\JavaProgramming\\src\\FileHandling\\note.txt"))){
            bw.write("Hare Krishna");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
