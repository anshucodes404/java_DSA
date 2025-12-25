package Recursion;
public class SortedArray {
    public static void main(String[] args) {
      int[] arr = {1, 3, 5, 7, 9, 10};
      System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int currentIndex) {
        if (currentIndex == arr.length - 1) {
            return true;
        }
        return arr[currentIndex] < arr[currentIndex + 1] && sorted(arr, currentIndex + 1);
    }
}
