package Sorting.Cyclic_Sort_Q;

import java.util.ArrayList;


public class Q2 {
    public static void main(String[] args) {
         int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
         sort(arr);
         missing(arr);
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[correct_index] != arr[i]) {
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

    static void missing(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
               ans.add(i+1);
            }
        }
     System.out.println(ans);
    }

}