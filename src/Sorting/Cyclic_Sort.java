package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (i == arr[i] - 1) {
                i++;
            } else {
                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
