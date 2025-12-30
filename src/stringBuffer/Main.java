package stringBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Anshu Kumar");
        sb.replace(2, 3, "Manash");
        sb.reverse();
        System.out.println(sb);
        System.out.println((int) sb.charAt(3));

        //randoms
        Random random = new Random();
        System.out.println(random.nextInt());

        //replacing
        String sentence = "Hi  h jju  iuui     iu i   t";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        //splitting
        String names = "Anshu Apurba Rashika Manthan";
        String[] name = names.split(" ");
        System.out.println(Arrays.toString(name));

        //roundings and formatting
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(56.89687467862428));
    }
}
