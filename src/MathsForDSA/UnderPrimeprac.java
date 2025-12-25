import java.util.Scanner;

public class UnderPrimeprac {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number till you want prime number: ");
            int n = sc.nextInt();
            boolean[] primes = new boolean[n + 1];
            printPrime(n, primes);
        }
    }

    static void printPrime(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for(int i = 2; i <= n ; i++){
            if(!primes[i]){
                System.out.println(i);
            }
        }

    }

}
