import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums = { 2 };
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        int last;
        int[][] ans = new int[k + 1][size];
        for (int j = 0; j < size; j++) {
            ans[0][j] = nums[j];
        }

        for (int i = 1; i <= k; i++) {
            last = ans[i - 1][size - 1];
            ans[i][0] = last;
            for (int j = 1; j < size; j++) {
                ans[i][j] = ans[i - 1][j - 1];
            }
        }
        for (int j = 0; j < size; j++) {
            nums[j] = ans[k][j];
        }
        System.out.println(Arrays.toString(nums));
    }
}