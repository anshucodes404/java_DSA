package Sorting.Cyclic_Sort_Q;

public class Q6 {
    public static void main(String[] args) {
         int[] arr = {1, 2, 0};
         sort(arr);
         System.out.println(min_missing(arr));
    }

    //Here we are ignoring -ve and elements greater than arr.length
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] != i + 1 && arr[i] > 0 && arr[i] <= arr.length ){
                swap(arr, i, correct_index);
            }
            else{
                i++;
            }
        }
    }

      static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    static int min_missing(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                int ans = i + 1;
                return ans;
            }
        }
        return 1;
    }
}
