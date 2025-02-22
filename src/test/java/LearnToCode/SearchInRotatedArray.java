package LearnToCode;

import javax.swing.*;

public class SearchInRotatedArray {

    /* 88 Search In Rotated Array
    its same as ssearchign element in array
    brute force and binaly search methods can be used

     */

    // butre force
    public static int searchInRotatedArray(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(searchInRotatedArray(nums, target));
        System.out.println(searchInRotatedArrayBinarySearch(nums, target));
    }

    // binary serch --> will not work becase ARRAY IS NOT SORTED
    public static int searchInRotatedArrayBinarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while (l < r) {
            m = (l + r) / 2;

            if (nums[m] == target)
                return m;
            else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }


        }
        return -1;
    }


}
