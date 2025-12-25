public class SetBit {
    public static void main(String[] args) {
        int num = 20;
        int n = 2;
        System.out.println(setBit(num, n));
    }

    static int setBit(int num, int n) {
        return num | 1 << n - 1;
    }
}
