package BinarySearch;

public class BS6 {
    public static void main(String[] args) {
        int[] arr = {100, 90, 78, 56, 23, 12, 7, 2, 1};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
          int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
       return arr[end];
    }
}
