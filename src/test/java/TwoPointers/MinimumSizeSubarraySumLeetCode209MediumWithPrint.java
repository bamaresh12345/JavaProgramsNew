package TwoPointer;

public class MinimumSizeSubarraySumLeetCode209MediumWithPrint {

    public static int MinimumSizeSubarraySum(int[] nums, int target) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;
        int maxLen = Integer.MAX_VALUE;

        while (right < n) {
            sum = sum + nums[right];

            while (sum >= target) {
                maxLen = Math.min(maxLen, right - left + 1);
                sum = sum - nums[left];
                left++;

                if (sum == target) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println();
                }


            }


            right++;
        }

        return maxLen == Integer.MAX_VALUE ? 0 : maxLen;


    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //int[] nums = {1, 4, 4};
        //int target = 4;

        System.out.println(MinimumSizeSubarraySum(nums, target));
    }
}
