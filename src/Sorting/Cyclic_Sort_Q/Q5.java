package Sorting.Cyclic_Sort_Q;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = { 1, 1};
        sort(arr);
        System.out.println(Arrays.toString(miss_dup(arr)));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    static int[] miss_dup(int[] arr) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}
