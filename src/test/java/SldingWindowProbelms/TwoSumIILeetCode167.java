package SldingWindowProbelms;

import java.util.Arrays;

public class TwoSumIILeetCode167 {

    public static int[] twoSum1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];  // *** IMP
            if (sum == target)  // ** IMP
                return new int[]{start + 1, end + 1};
            else if (sum < target)  // * IMP
                start++;
            else
                end--;
        }


        return new int[]{-1, -1};
    }

    public static int[] twoSum2BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};

                }
            }

        }


        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] n = new int[2];
        n = twoSum1(nums, target);
        System.out.println(Arrays.toString(n));

        int[] n1 = new int[2];
        n1 = twoSum2BruteForce(nums, target);
        System.out.println(Arrays.toString(n1));
    }
}
