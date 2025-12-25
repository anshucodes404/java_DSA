public class scope {
    public static void main(String[] args) {
        int a = 56;
        int b = 36;
        {
            a = 37;
            int c = 29;
            System.out.println(c);
        }

        int c = 10;
        System.out.println(a + " " + b + " " + c);
    }
}
