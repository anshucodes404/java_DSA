import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 6, 3, 9, 10, 4, 13, 78, 90, 5, 3, 2};
        sort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int largest){
        if(row == 0){
            return;
        }
        if(col <= row){
            if(arr[col] > arr[largest]){
                largest = col;
            }
            sort(arr, row, col + 1, largest);
        }else{
            //do swapping work,./
            int temp = arr[largest];
            arr[largest] = arr[col - 1];
            arr[col - 1] = temp;
            //Moving to find next largest number
            sort(arr, row - 1, 0, 0);
        }
    }
}
