package BinarySearch;

import java.util.Arrays;

public class BS3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 6, 6, 6, 6, 6, 8, 9, 10, 10};
        System.out.println(Arrays.toString(search(arr, 4)));
    }

    static int[] search(int[] arr, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = arr.length - 1;

        // Finding first ocurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
               while(arr[mid - 1] == target){
                mid--;
               }
               result[0] = mid;
               break;
            }
        }
        // Finding last ocurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
               while(arr[mid + 1] == target){
                mid++;
               }
               result[1] = mid;
               return result;
               
            }
        }
        return new int[]{-1, -1};
    }
}
