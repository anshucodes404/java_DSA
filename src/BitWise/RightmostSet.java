public class RightmostSet{
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));
        int RightmostSetNumber = n & -n;
        int setDigit = (int)Math.log(RightmostSetNumber) + 1;
        System.out.println(setDigit);
    }
}