public class Poweroftwo {
    public static void main(String[] args) {
        int n = 0;
        if((n & (n - 1)) == 0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
