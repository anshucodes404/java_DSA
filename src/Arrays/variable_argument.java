import java.util.Arrays;

public class variable_argument {
    public static void main(String[] args) {
        fun(2, 4, 6, 23, 89, 48);
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
}
