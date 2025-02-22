package LearnToCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumLeetCode {
    //brutre force method
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }


        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        // int[] nums = {2, 7, 11, 15};
        // int target = 9;
        int[] nums = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumSortedArray(nums, target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));


    }

    //Two Sum sorted array
    public static int[] twoSumSortedArray(int[] nums, int target) {
       /* use TWO POINTER end = nums.lenth-1 is IMP**
       1. use two pointer method start and end variables
       2. run while loop till start < end
       3. get the sum = array of start and array of end
       4. if sum = target , return start and end
       5. if sum < target incemernt start++
       6. else decrment end--

        */

        int start = 0;
        int end = nums.length - 1;
        int sum = 0;

        while (start <= end) {
            sum = nums[start] + nums[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }

    //using HashMap
    public static int[] twoSumHashMap(int[] nums, int target) {

     /*
     1. declare HashMap with Integer and Integer
     2. there is concept call target = nums[i] + nums[i] --> use nums[i] = target - nums[j]
     3. use comp as varialbe to store result
     4. if comp is not part of hashMap , then punt nums[j] and its index in hasMap
     5. if found then return current index and the comp
    */


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp) + 1, i + 1};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};

    }
}
