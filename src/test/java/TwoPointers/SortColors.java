package TwoPointer;

import java.util.Arrays;

public class SortColors {

    public static int[] sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        //  System.out.println(Arrays.toString(sortColors(nums)));

        System.out.println(Arrays.toString(sortColorsArray(nums)));
    }

    public static int[] sortColorsArray(int[] nums) {

        int[] arr = new int[nums.length];
        int start = 0;
        int index = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] == 0) {
                nums[start] = 0;
                start++;
            } else if (nums[i] == 2) {
                arr[end] = 2;
                end--;
            }


        }

        for (int i = start; i <= end; i++) {
            arr[start] = 1;
            start++;
        }

        return arr;

    }
}
