package LeetCode150Questions;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNUmberLeetcode {

    public static int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxUnique = -1;

        // Find the largest number with frequency 1
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                maxUnique = Math.max(maxUnique, num);
            }
        }

        return maxUnique;
    }

    public static void main(String[] args) {
        int[] nums1 = {5,7,3,9,4,9,8,3,1};
        System.out.println("Output: " + largestUniqueNumber(nums1)); // Output: 8

        int[] nums2 = {9,9,8,8};
        System.out.println("Output: " + largestUniqueNumber(nums2)); // Output: -1
    }
}