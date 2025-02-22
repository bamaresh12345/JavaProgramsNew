package ArraysLeetCodeFinalMedium;

import java.util.HashMap;
import java.util.Map;

/* 540. Single Element in a Sorted Array Medium
You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.

Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1: Input: nums = [1,1,2,3,3,4,4,8,8] Output: 2

Example 2: Input: nums = [3,3,7,7,10,11,11] Output: 10

 */

public class SingleElementinSortedArrayLeetCode540M {


    /*
    1. Store all in HasMap with map<Integer,Integer>
    2. run Map.Entry loop
    3. check entry.getValue()==1 ,then return entry.getKey(); done

     */
    public static int singleElementinSortedArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], (map.get(nums[i])) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(singleElementinSortedArray(nums));
    }
}
