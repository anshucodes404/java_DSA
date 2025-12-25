package BinarySearch;

public class SearchMountain {
     public static void main(String[] args) {
        int[] arr = {1, 4, 58, 23, 91, 92, 100, 90, 78, 56, 23, 12, 7, 2, 1};
        int target = 77;
        System.out.println(search(arr, target));
     }

     static int search(int[] arr, int target){
        int peakIndex = peakIndex(arr);
        int ascnPart = binarySearch(arr, target, 0, peakIndex, true);
        int descPart = binarySearch(arr, target, peakIndex, arr.length - 1, false);
        if(ascnPart != -1){
            return ascnPart;
        }
        else if(descPart != -1){
            return descPart;
        }
        else{
            return -1;
        }
      }

     static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
     }

     static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(arr[mid] < arr[mid+1]){
                //Ascending part
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
     }
}
