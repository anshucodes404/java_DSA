public class Noofdigits {
    public static void main(String[] args) {
        int n = 478529;
        int b = 2; 
        int count = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(count);
    }
}
  