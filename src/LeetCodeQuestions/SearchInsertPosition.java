package LeetCodeQuestions;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = -13;
        int index = findIndex(nums, target);
        System.out.println("Index: " + index);
     }

     static int findIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        if(nums.length == 0) return 0;
        if(nums.length == 1){
            if(nums[0] == target || nums[0] > target ) return 0;
            else return 1;

        }
        while(start <= end){
            //here one edge case exists if the number to be added at 0 index then it causes issue fix
            if(nums[mid] == target){
                return mid;
            }
            else if(mid == 0) return 0;
            else if(mid == nums.length - 1){
                return nums.length;
            }
            else if(nums[mid] > target && nums[mid - 1] < target){
                return mid;
            }
            else if(nums[mid] < target && nums[mid + 1] > target){
                return mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if(nums[start] < target){
            return start + 1;
        }
        else{
            return start - 1;
        }
     }
}
