package StackQueues;

import java.util.Arrays;

public class GameOfTwoStacks {
    //this question is from hackerRank medium level
    static int twoStacks(int maxSum, int[] a, int[] b){
        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count){
        //base condition
        if(sum > maxSum || a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1); //this is to select element from a
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1); //this is to select answer from b

        //now returning the max of both the answers

        return Math.max(ans1, ans2);


    }

    public static void main(String[] args){
         int[] a = {4, 2, 4, 6, 1};
         int[] b = {2, 1, 8, 5};
        System.out.println(twoStacks(10, a, b));
    }
}
