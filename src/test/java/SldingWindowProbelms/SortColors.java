package SldingWindowProbelms;

import java.util.Arrays;

//https://www.youtube.com/watch?v=G4LWBrda_H4
public class SortColors {
    // just sort the array you will see the results and retunr nums
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

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

        System.out.println(Arrays.toString(sortColors(nums)));
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColorsNewArray(nums1)));

        int[] nums2 = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColorsOptimizedSolutions(nums2)));
    }

    /*
       1. declare start and end = 0 and nums.length-1
       2. declare new array with same length
       2. run for loop till end of arry
       3. if you find nums[i] =0 then arr[start] = nums[i]
       4. if you find nums[i] =2 then arr[end] = nums[i]
       5. run 1 more for loop starting i=start and i < = end i++
       assign arr[start]=1;
       6. finally return array

     */
    public static int[] sortColorsNewArray(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        int[] arr = new int[nums.length];  // ** IMP

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                arr[start] = 0;
                start++;
            } else if (nums[i] == 2) {
                arr[end] = 2;
                end--;
            }
        }

        for (int i = start; i <= end; i++) { // *** IMP
            arr[i] = 1;
        }

        return arr;


    }

     /*
       1. declare start and end = 0 and nums.length-1
       2. declare new array with same length
       2. run for loop till end of arry
       3. if you find nums[i] =0 then arr[start] = nums[i]
       4. if you find nums[i] =2 then arr[end] = nums[i]
       5. run 1 more for loop starting i=start and i < = end i++
       assign arr[start]=1;
       6. finally return array

     */

    public static int[] sortColorsOptimizedSolutions(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        int index = 0;

        while (index <= end) {

            if (nums[index] == 0) {
                swap(nums, index, start);
                start++;
                index++;
            } else if (nums[index] == 2) {
                swap(nums, index, end);
                end--;
            } else {
                index++;
            }
        }

        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
