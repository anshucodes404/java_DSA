package Sorting.Cyclic_Sort_Q;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 1, 8, 2, 3, 1};
        sort(arr);
        System.out.println(duplicates(arr));
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

    static ArrayList<Integer> duplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
