package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6};
      System.out.println(RotationCounting(arr));
    }

    static int RotationCounting(int[] arr) {
        int count = findPivotIndex(arr);
        return count + 1;
    }

    static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
