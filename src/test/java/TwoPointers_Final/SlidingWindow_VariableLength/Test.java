package TwoPointers_Final.SlidingWindow_VariableLength;

import java.util.Arrays;

public class Test {
    public static int[] searchRange(int[] nums, int target) {


        int[] arr = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {  //Validate num[i] == target

                if (arr[0] == -1) {
                    arr[0] = i;   // first occurrence
                }
                arr[1] = i;        // ALWAYS update last occurrence , IMP *** without else statment
            }
        }
        return arr;

    }


    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
}
