package TwoPointers;

public class MinimumSizeSubarraySumLeetCode209MediumWithPrint {

    public static int MinimumSizeSubarraySum(int[] nums, int target) {
        int left = 0;


        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            if (sum == target) {
                for (int i = left; i <= right; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;


    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //int[] nums = {1, 4, 4};
        //int target = 4;

        System.out.println(MinimumSizeSubarraySum(nums, target));
    }
}
