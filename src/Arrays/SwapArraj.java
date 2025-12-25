import java.util.Arrays;

public class SwapArraj {
    public static void main(String[] args) {

        int[] arr = { 23, 78, 10, 90, 38, 79 };

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int size = arr.length;
        int start = 0;
        int end = size - 1;
        while (start <= end / 2) {
            swap(arr, start, end - start);
            start++;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
