public class PrimeNo {
   public static void main(String[] args) {
    int n = 125437;
    System.out.println(isPrime(n));
   }

   static boolean isPrime(int n){
    boolean isPrime = true;

    if(n <= 1){
        return false;
    }

    for(int i = 2; i < Math.sqrt(n); i++){
        if(n % i == 0){
            isPrime = false;
            break;
        }
    }

    return isPrime;
   }
}