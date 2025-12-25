package Recursion;

import java.util.ArrayList;

public class FindAllIndices {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 8, 4, 2, 3, 4, 90, 4 };
        findAllIndices(arr, 4, 0);
        System.out.println(list);
        System.out.println(findIndices(arr, 4, 0, new ArrayList<>()));
        System.out.println(findIndices2(arr, 4, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndices(int[] arr, int target, int currentIndex) {
        if (currentIndex == arr.length) {
            return;
        }
        if (arr[currentIndex] == target) {
            list.add(currentIndex);
        }
        findAllIndices(arr, target, currentIndex + 1);
    }

    static ArrayList<Integer> findIndices(int[] arr, int target, int currentIndex, ArrayList<Integer> list2) {
        if (currentIndex == arr.length) {
            return list2;
        }
        if (arr[currentIndex] == target) {
            list2.add(currentIndex);
        }
        return findIndices(arr, target, currentIndex + 1, list2);
    }

    static ArrayList<Integer> findIndices2(int[] arr, int target, int currentIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        if (currentIndex == arr.length) {
            return list;
        }
        if (arr[currentIndex] == target) {
            list.add(currentIndex);
        }
        ArrayList<Integer> ansFromBelow = findIndices2(arr, target, currentIndex + 1);
        list.addAll(ansFromBelow);
        return list;
    }
}
