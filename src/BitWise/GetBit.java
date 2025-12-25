public class GetBit {
    public static void main(String[] args) {
        int num = 7;
        int n = 3;
        if(getBit(num, n) == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }

    static int getBit(int num, int n){
        return num & 1 << n - 1;
    }
}
