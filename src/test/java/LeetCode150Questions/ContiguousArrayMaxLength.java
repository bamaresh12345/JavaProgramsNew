package LeetCode150Questions;

import java.util.HashMap;

public class ContiguousArrayMaxLength {

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // To handle the case when the entire array is balanced
        int maxLength = 0;
        int balance = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1 and 1 as +1   Length=CurrentIndex−(−1)=CurrentIndex+1
            balance += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(balance)) {
                maxLength = Math.max(maxLength, i - map.get(balance));
            } else {
                map.put(balance, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        System.out.println("Output: " + findMaxLength(nums1)); // Output: 2

        int[] nums2 = {0, 1, 0};
        System.out.println("Output: " + findMaxLength(nums2)); // Output: 2
    }
}
