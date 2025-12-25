package BinarySearch;

import java.util.Arrays;

public class BS4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 8, 10 };
        int target = 1;
        System.out.println(Arrays.toString(result(arr, target)));
    }

    static int[] result(int[] arr, int target) {
        int[] result = { -1, -1 };
        result[0] = search(arr, target, true);
        if(result[0] != -1){
            result[1] = search(arr, target, false);
        }
        return result;
    }

    static int search(int[] arr, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                //Potential answer is found
                ans = mid;
                if (findStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
