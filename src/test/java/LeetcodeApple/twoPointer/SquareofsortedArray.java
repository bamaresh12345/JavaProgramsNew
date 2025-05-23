package LeetcodeApple.twoPointer;

import java.util.Arrays;

public class SquareofsortedArray {

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        System.out.println(Arrays.toString(squareofsortedArray(nums)));
    }

    private static int[] squareofsortedArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i]> nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }

        return nums;
    }
}
