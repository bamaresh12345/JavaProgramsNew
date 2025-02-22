package LeetCode150Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 912 Sort Array
Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space
complexity possible.

Input: nums = [5,2,3,1] Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the
 positions of other numbers are changed (for example, 1 and 5).

 Input: nums = [5,1,1,2,0,0] Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 */
public class SortAnArrayLt912Imp {

    public static int[] sortArray(int[] nums) {
    /* run for loop with i till end of array
    2. run one more for loop till end of array starting i+1
    3. compare elelment of array i with array of j if i> j
    4. swapt the array withtemp val iralve
    5. finally return sorted array
    */
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }

        return nums;

    }

    public static void main(String[] args) {

        //int[] nums = {5,2,3,1};
        int[] nums = {5, 1, 1, 2, 0, 0};

        // System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(sortArrayHashMap(nums)));
    }


    public static int[] sortArrayHashMap(int[] nums) {
        /*
        1. deloacre map with Integer and Intger
        2. run the for loop till end of array
        3. store each elment with number of frequency
        4. and also get the min and max value of the array in the same for loop
        4. initlize index =0, which will assing to nums[index] =i(min starting value)
        5. run one more for loop starting from min and ending with max value, since array is sorted
        6. whith while loop based on default map (,0) > 0 , start putting values in array till the frequency goes to 0
        7. finally return array

         */
        int min = nums[0], max = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }

            if (nums[i] < min)
                min = nums[i];

            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println(min);
        System.out.println(max);
        int index = 0; // Very IMP****
        for (int i = min; i <= max; i++) { // i<=max is VERY IMP****

            while (map.getOrDefault(i, 0) > 0) // while is IMP for all duplicate values
            {
                nums[index] = i;

                map.put(i, map.get(i) - 1); // map.put(i, map.get(i)-1) is very IMP ***
                index++;    // index incrment is very IMP ***
            }

        }

        return nums;
    }

}
