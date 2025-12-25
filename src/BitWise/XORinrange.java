public class XORinrange {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        System.out.println(xor(a) ^ xor(b));
    }

    static int xor(int n){
        int ans = 0;
        int rem = n % 4;
        if(rem == 0){
            ans = n;
        }
        else if(rem == 1){
            ans = 1;
        }
        else if(rem == 2){
            ans = n + 1;
        }
        else if(rem == 3){
            ans = 0;
        }

        return ans;
    }
}
