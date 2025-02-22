package LeetCode150Questions;

import java.util.Arrays;

public class moveZeros {

    public static int[] moveZerostoRigth(int[] nums) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[counter++] = nums[i];
            }

        }

        for (int i = counter; i < nums.length; i++) {   // while(counter < nums.length) also works eaither is file

            nums[counter++] = 0;
        }


        return nums;
    }

    public static void main(String[] args) {
        // can be solved using simnle pointer array also using count=0

        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZerostoRigth(nums)));
        //int[] nums1 = {0,1,0,3,12};
        //  System.out.println(Arrays.toString(moveZerostoleft(nums1)));


    }


}
