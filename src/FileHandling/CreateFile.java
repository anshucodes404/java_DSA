package FileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        String file = "D:\\DSA\\JavaProgramming\\src\\FileHandling\\note.txt";
        try{
            File fo = new File(file);
            if(fo.createNewFile()){
                System.out.println("File created: "+ fo.getName());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileWriter fo = new FileWriter(file);
            fo.write("काम्यानां कर्मणा न्यासं सन्न्यासं कवयो विदुः । सर्वकर्मफलत्यागं प्राहुस्त्यागं विचक्षणाः ॥");
            fo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            BufferedReader fo = new BufferedReader(new FileReader(file));
            System.out.println(fo.readLine());
            File fd = new File(file);
            fo.close();
            if(fd.delete()){
                System.out.println(fd.getName());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
