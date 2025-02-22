package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIIarray {
 /*   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
  Example 1:  Input: nums = [2,7,11,15], target = 9     Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 Example 2:     Input: nums = [3,2,4], target = 6     Output: [1,2] */

    public static int[] twoSum2(int[] nums, int target) {   /*
        1. delcare HashMap with Integer and Integer
        2. run for loop till end of array
        3. use concept of complementary comp = target - arrayValue
        4. check arrayvlue is present in HashMap if yes
        return arravalue index and already existing HashMap value index
        6. else finally return -1,-1
         */

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int comp = target - nums[i];

            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1, -1};


    }

    public static void main(String[] args) {

        //int[] nums = {2,7,11,15};
        //int target = 9;
        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));

    }
}
