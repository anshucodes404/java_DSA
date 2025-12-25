package Recursion;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = { 'h','e','l','l','o' };
        reverse(str, 0);
        System.out.println(Arrays.toString(str));
        // System.out.println(str);
    }

    static void reverse(char[] str, int index) {
        if (index > str.length / 2 - 1) {  //Want to visualise do in copy
            return;
        }
        int last_Index = str.length - index - 1;
        char temp = str[index];
        str[index] = str[last_Index];
        str[last_Index] = temp;
        reverse(str, index + 1);
    }
}
