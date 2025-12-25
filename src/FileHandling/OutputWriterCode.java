package FileHandling;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputWriterCode {
    public static void main(String[] args) {
        OutputStream os = System.out;
        //os.write("😂");  doesn't print b/c range is exceeded of unicode values
        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(78);
            osw.write("A");
            osw.write(10);
            osw.write("10");
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            osw.write("😂");
            osw.write('A');
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
