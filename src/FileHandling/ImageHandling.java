package FileHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {
    public static void main(String[] args) throws IOException {

        String readPathURL = "/home/anshu/Codes/DSA/JavaProgramming/bird.jpg";
//        String writePathURL = "D:\\DSA\\JavaProgramming\\src\\FileHandling\\birdCopied.jpg";
        String writePathURL = "/home/anshu/birdCopied.jpg";

        BufferedImage image = null;
        image = readFromPath(image, readPathURL);

        if(image != null){
            writeToPath(writePathURL, image);
        } else {
            System.out.println("Image not found");
        }
    }

    public static BufferedImage readFromPath(BufferedImage image, String readPathURL){
        try{
            File file = new File(readPathURL);
            image = ImageIO.read(file);

            System.out.println("Image read successfully " + image);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return image;
    }

    public static void writeToPath(String writePathURL, BufferedImage image){
        try{
            File fileOutput = new File(writePathURL);
            ImageIO.write(image, "jpg", fileOutput);
            System.out.println("File created successfully");

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
