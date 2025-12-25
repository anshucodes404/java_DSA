package Recursion;
public class NumPrint {
    public static void main(String[] args) {
        int n = 9;
        printNum(n);
    }

    static void printNum(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
}
