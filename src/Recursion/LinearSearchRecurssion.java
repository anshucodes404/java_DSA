package Recursion;
public class LinearSearchRecurssion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 89, 31, 90, 3 };
        int target = 9;
        System.out.println("Index of the target is: " + search(arr, target, 0));
    }

    static int search(int[] arr, int target, int currentIndex) {
        if (currentIndex == arr.length) {
            return -1;
        }

        if (arr[currentIndex] == target) {
            return currentIndex;
        }
        return search(arr, target, currentIndex + 1);
    }
}
