package BinarySearch;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 5, 7, 10};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
