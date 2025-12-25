package BinarySearch;

public class BS1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 12, 20, 30, 45, 67, 78 };
        int target = 21;
        int ceiling = CSearch(arr, target);
        int floor = FSearch(arr, target);
        System.out.println("Ceiling of the array: " + ceiling);
        System.out.println("Floor of the array: " + floor);
    }

    static int CSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
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
                return arr[start];
    }

    static int FSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
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
        return arr[end];
    }
}
