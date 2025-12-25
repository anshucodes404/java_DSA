// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

import java.util.Arrays;

public class SumIndices {
   public static void main(String[] args) {
       int[] nums = {2, 3, 8, 4};
       int target = 6;
       System.out.println(Arrays.toString(twoSum(nums, target)));
   }

   public static int[] twoSum(int[] nums, int target){
      int[] indices = new int[2];
      for(int i = 0; i < nums.length; i++){
         int first = nums[i];
         indices[0] = i;
         for(int j = 0; j < nums.length; j++){
            if(i != j){
               if(first+nums[j] == target){
                  indices[1] = j;
                  break;
               }
            }
         }
         if(indices[1] != 0){
            break;
         }
      }
    
      return indices;
   }
    
}