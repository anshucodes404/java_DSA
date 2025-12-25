package BinarySearch;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
         };
         int target = 11;
         System.out.println(Arrays.toString(search(matrix, target)));
     }

    // Search in the row provided and between the columns provided
    static int[] binarySearch(int[][] matrix, int target, int cStart, int cEnd, int row) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length; // Be cautious matrix may be empty

        if (rows == 1) {
            binarySearch(matrix, target, 0, col - 1, 0);
        }

        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cMid = col / 2;

        while (rStart < rEnd - 1) { // 2 rows will be left while this is true
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            } else if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        // Now we have two rows left
        // Check whether the target is in the column of the two rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        } else if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }
        // Now search in 1st Half
        else if (target <= matrix[rStart][cMid - 1] && target >= matrix[rStart][0]) {
            binarySearch(matrix, target, 0, cMid - 1, rStart);
        }

        // Now search in 2nd Half

        else if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            binarySearch(matrix, target, cMid + 1, col - 1, rStart);
        }

        // Now search in 3rd Half
        else if (target <= matrix[rStart + 1][cMid - 1] && target >= matrix[rStart + 1][0]) {
            binarySearch(matrix, target, 0, cMid - 1, rStart + 1);
        }

        // Now search in 4th half
        else if (target <= matrix[rStart + 1][cMid + 1] && target >= matrix[rStart + 1][cMid + 1]) {
            binarySearch(matrix, target, cMid + 1, col - 1, rStart + 1);
        }
        return new int[] { -1, -1 };
    }
}
