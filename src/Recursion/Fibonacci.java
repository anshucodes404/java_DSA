package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the fibonacci number you want: ");
            int n = sc.nextInt();
            int reqNum = fibo(n);
            System.out.printf("%d th term of the fibonacci series is: %d\n", n, reqNum);
            System.out.println(Integer.toBinaryString(reqNum));
        }
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
