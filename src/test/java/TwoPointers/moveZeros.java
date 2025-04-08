package TwoPointers;

import java.util.Arrays;

public class moveZeros {

    public static int[] moveZerostoRigth(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }

        }

        for (int i = left; i < nums.length; i++) {
            nums[left++] = 0;
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        // can be solved using simnle pointer array also using count=0

        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZerostoRigth(nums)));


    }


}
