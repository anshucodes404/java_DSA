
import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        String up = "abc";
        subseq("", up);
        System.out.println(subseqReturn("", up));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //Now make two recursion calls in one to ignore ch and in one take it
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    static ArrayList<String> subseqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        //Now make two recursion calls in one to ignore ch and in one take it
        ArrayList<String> left = subseqReturn(p + ch, up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
