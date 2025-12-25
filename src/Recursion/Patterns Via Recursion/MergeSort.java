import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 6, 7, 40, 33, 3, 2, 4, 8, 10};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length)); //last index is excluded
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i];
                i++;
            }else{
                mix[k++] = right[j];
                j++;
            }
        }
        //It may be possible that one array is not ended
        while( i < left.length){//runs when left array is larger
            mix[k++] = left[i];
            i++;
        }
        while( j < right.length){//runs when left array is larger
            mix[k++] = right[j];
            j++;
        }

        return mix;
    }
}
