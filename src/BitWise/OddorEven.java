public class OddorEven {
    public static void main(String[] args) {
        int n = 69;
        if(checkOddEven(n)){
            System.out.println("Is odd");
        }else{
            System.out.println("Is even");
        }
    }

    static boolean checkOddEven(int n){
        return (n & 1) == 1;
    }
}
