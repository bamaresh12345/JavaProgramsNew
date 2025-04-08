package LeetCode150Questions;

import java.util.Arrays;

public class CheckForTarget {

    public static int[] checkForTarget(int[] nums,int target)
    {
       int left=0;
       int right=nums.length-1;
       int sum=0;

       while(left < right)
       {
           sum = nums[left] + nums[right];
           if(sum ==target)
           {


               return new int[] {left,right };
           } else if (sum < target) {
               left++;
           }
           else
           {
               right--;
           }

       }

        return new int[] {-1,-2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
        int target=13;

        System.out.println(Arrays.toString(checkForTarget(nums,target)));
    }
}
