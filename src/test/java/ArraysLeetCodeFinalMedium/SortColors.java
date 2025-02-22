package ArraysLeetCodeFinalMedium;

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

        int start = 0;
        int end = nums.length - 1;

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
       1. declare start and end = nums.length-1 and index=0;
       2. run while loop till index <=end
       2. check if nums[index] == 0 zero
       3. swap index and start with nums[] array
       4. and move forward index++ and start++
       5. else if check nums[index]==2
       6. swap index and end with nums[] array
       7. only decrement end , i.e end-- , keep start and index postion same
       8. else (i.e if nums[index]==1)
       9, jsut incrment index , ie. index++
       10. finally it should give the sorted array.

     */

    public static int[] sortColorsOptimizedSolutions(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        int index = 0;

        while (index <= end) { // *** IMP

            if (nums[index] == 0) {  // *** IMP    check for 0
                swap(nums, index, start);
                start++;
                index++;
            } else if (nums[index] == 2) {  // *** IMP    check for 2
                swap(nums, index, end);
                end--;
            } else {                     // *** IMP    checking for 1
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
