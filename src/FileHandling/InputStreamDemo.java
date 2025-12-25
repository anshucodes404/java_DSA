package FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamDemo {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letter = isr.read();//reads one character at a time also convert them to Unicode value
            while(isr.ready()){ //this is used to check whether more inputs are left or what
                System.out.println((char) letter); //here the letter is again reversed to its character form
                letter = isr.read();//reads the stream until it reached to end
            }
            isr.close();//no need try will close it
            System.out.println();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
