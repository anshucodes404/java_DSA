package BinarySearch;

public class SearchInfinite {
    public static void main(String[] args) {
        // Finding the start and end as it is an infinite arr we are not allowed ti use
        // .length
        // for better range finding we can increse them exponentially
       int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 19, 20, 23, 24, 29, 34, 38, 40, 57, 78, 90, 100};
       System.out.println(findIndex(arr, 17));
    }

    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = 1;
        
        // Keep expanding the range until target is less than end
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2; // double the size of box
            start = temp;
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
        }
        
        int index = infiniteArray(arr, target, start, end);
        return index;
    }

    static int infiniteArray(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
