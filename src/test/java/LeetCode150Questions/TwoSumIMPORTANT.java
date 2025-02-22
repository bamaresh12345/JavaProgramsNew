package LeetCode150Questions;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
numbers such that they add up to a specific target number. Let these two numbers be numbers[index1]
and numbers[index2]  where 1 <= index1  < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1,
index2] of length 2.
Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Example 2:
Input: numbers = [2,3,4], target = 6  Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIMPORTANT {


    //Bruteforce

   /* run for loop till end of array with i
    run for loop till end of array with j
    compare arr[i] with arr[j] and check if its == to target
    if resturn indices fo i,j else finally
            return indices of -1,-1  */


    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }

        return new int[]{-1, -1};

    }


    public static int[] twoSumMaps(int[] nums, int target) {

        /*1. create hashMap with Integer, Integer
        2. sum = target -x us this logic 9-2 , check 7 is in hasMap
        3. if sum already found in map the new find the solution
        4. else continue  till end of solution
        5. finally not found return -1,-1
        */

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (map.containsKey(comp)) {

                return new int[]{map.get(comp), i}; //Very IMP***
            } else {
                map.put(nums[i], i); // **VERY IMP
            }

        }

        return new int[]{-1, -1};

    }


    public static void main(String[] args) {

        int[] numbers = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSumBruteForce(numbers, target)));
        System.out.println(Arrays.toString(twoSumMaps(numbers, target)));
        System.out.println(Arrays.toString(twoSum11swaps(numbers, target)));
    }


    public static int[] twoSum11swaps(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1; // *** IMP
        int sum = 0;
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                return new int[]{start, end};

            }
        }
        return new int[]{-1, -1};


    }

}
