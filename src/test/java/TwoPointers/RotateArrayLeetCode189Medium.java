package TwoPointer;

import java.util.Arrays;

public class RotateArrayLeetCode189Medium {

    public static void RotateArray(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray(nums, k);

    }
}
