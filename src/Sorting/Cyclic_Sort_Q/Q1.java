package Sorting.Cyclic_Sort_Q;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
       int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
       int n = arr.length;
       System.out.println(Arrays.toString(sort(arr, n)));
       System.out.println(missing(arr, n));
    }

    static int[] sort(int[] arr, int n) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (correct_index == n || i == arr[i]) {
                i++;
                continue;
            } else {
                 swap(arr, i, correct_index);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    static int missing(int[] arr, int n){
        for(int i = 0; i < n; i++){
            if(i != arr[i]){
                return i;
            }
        }
        return n;
    }
}
