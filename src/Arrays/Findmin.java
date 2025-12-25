public class Findmin {
    public static void main(String[] args) {
        int[] arr = {23, 78, 90, 12, 67, 89};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int number : arr){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
}
