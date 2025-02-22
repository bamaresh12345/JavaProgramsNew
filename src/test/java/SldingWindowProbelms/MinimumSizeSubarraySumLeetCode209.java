package SldingWindowProbelms;

/*
209. Minimum Size Subarray Sum -- Medium

Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1: Input: target = 7, nums = [2,3,1,2,4,3] Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2: Input: target = 4, nums = [1,4,4] Output: 1

Example 3: Input: target = 11, nums = [1,1,1,1,1,1,1,1] Output: 0


 2, 3, 1, 2, 4, 3  ,
   ^
right
^
left
run for loop right=0 till end of array right++
sum = sum + nums[right];Check if sum > = target,if yes shrink left sum = sum - nums[left++];
store Mat.min  len , right-left+1 and incrment left++
return len == Integer.MAX_VALUE ? 0 : len;

 */
public class MinimumSizeSubarraySumLeetCode209 {

    public static int minimumSizeSubarraySum(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            while (sum >= target) {
                len = Math.min(len, right - left + 1);
                sum = sum - nums[left];
                left++;
            }


        }
        System.out.println("Length --> " + len);
        return len == Integer.MAX_VALUE ? 0 : len;

    }


    public static void main(String[] args) {

      /*  int min = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(min1);*/

        int[] nums = {2, 3, 1, 2, 4, 3}; //2
        int target = 7;
        System.out.println("**********ANS************");
        //int k = minimumSizeSubarraySum(target, nums);
        System.out.println("testing " + minimumSizeSubarraySum(target, nums));
    }
}
