package LeetcodeApple.slidingWindow;

public class MinSizeSubArray {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSizeSubArray(nums,target));
    }

    private static int minSizeSubArray(int[] nums, int target) {

        int left=0;
        int sum=0;
        int maxLen=Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {      // ** IMP

            sum = sum + nums[right];

            if(sum >= target)
            {
                maxLen = Math.min(maxLen, left-right+1);   // ** IMP Math.min***
                sum = sum - nums[left];
                left++;
            }

        }
        return maxLen == Integer.MAX_VALUE ? 0 : maxLen; // ** IMP
    }
}
