import java.util.ArrayList;

public class EfficientFactors {
    public static void main(String[] args) {
        int n = 927402;
        factors(n);
        System.out.println();
        factors2(n);
    }

    static void factors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
   
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    static void factors2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}