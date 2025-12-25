public class Factors {
    public static void main(String[] args) {
        int n = 122;
        factors(n);
    }

    static void factors(int n){
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}
