import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 6, 3, 9, 10, 4, 13, 78, 90, 5, 3, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
       if(low >= high){
           return;
       }
       int start = low;
       int end = high;
       int mid = ( start + end ) / 2;
       int pivot = arr[mid];

       while(start <= end){
           //this skips swaps if start and end values are in right side of pivot
           while(arr[start] < pivot){
               start++;
           }
           while(arr[end] > pivot){
               end--;
           }

           if(start <= end){
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }
       }
       //now sort the two halves of the array
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
