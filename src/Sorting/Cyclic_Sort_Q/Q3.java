package Sorting.Cyclic_Sort_Q;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        sort(arr);
        int duplicate = arr[arr.length - 1];
        System.out.println(duplicate);
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

}
