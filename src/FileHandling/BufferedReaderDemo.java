package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        //byte to char stream and then reading the char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Type something: ");
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader brFile = new BufferedReader(new FileReader("D:\\DSA\\JavaProgramming\\src\\FileHandling\\note.txt"))){
            System.out.println("The file contains: " + brFile.readLine());
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
