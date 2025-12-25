public class Singleelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 18, 3, 2};
        System.out.println(single(arr));
    }
    static int single(int[] arr){
        int single = 0;
        for (int j : arr) {
            single = single ^ j;
        }
        return single;
    }
}
