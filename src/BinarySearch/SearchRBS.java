package BinarySearch;

public class SearchRBS {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 10, 1, 2, 3 };
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        int index;
        if (pivot == -1) {
            index = BS(arr, target, 0, arr.length - 1);
        } else {
            if (arr[pivot] == target) {
                index = pivot;
            } else if (arr[0] <= target) {
                index = BS(arr, target, 0, pivot);
            } else {
                index = BS(arr, target, pivot + 1, arr.length - 1);
            }
        }
        return index;
    }

    static int BS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
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
