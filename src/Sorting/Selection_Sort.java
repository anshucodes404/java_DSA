package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 9, 10, 7, 3, 6 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            int index = 0;
            int largest = arr[0];
            for (j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                    index = j;
                }

            }
            int temp = arr[j];
            arr[j] = largest;
            arr[index] = temp;

        }

        return arr;
    }
}
