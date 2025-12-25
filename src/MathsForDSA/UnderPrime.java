public class UnderPrime {
    public static void main(String[] args) {
        int n = 40;
        // printPrime(n);
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);

    }

    // static void printPrime(int n){
    // boolean isPrime;
    // for(int i = 2; i <= n; i++){
    // isPrime = true;
    // for(int j = 2; j <= Math.sqrt(i); j++){
    // if(i % j == 0){
    // isPrime = false;
    // break;
    // }
    // }
    // if(isPrime){
    // System.out.println(i + " is Prime");
    // }
    // }
    // }
    // NOT OPTIMISED WAY
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.println(i + " is prime");
            }
        }
    }

}
