package Recursion;
public class SumDigits {
    public static void main(String[] args) {
        int n = 6783;
        System.out.println(digitsSum(n));
    }

    static int digitsSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + digitsSum(n / 10);
    }
}
