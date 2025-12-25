package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {1, 2, 4, 6, 7, 9, 10, 12, 17};
       int target = 1;
       int start = 0;
       int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end){
        if(end < start){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
