package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class SingleElementinSortedArrayLeetCode540M {

    public static int SingleElementinSortedArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(map.get(nums[i]), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(SingleElementinSortedArray(nums));
    }
}
