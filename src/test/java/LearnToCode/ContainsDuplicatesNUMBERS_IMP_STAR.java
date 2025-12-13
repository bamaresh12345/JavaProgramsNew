package LearnToCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicatesNUMBERS_IMP_STAR {

    //brute force method
    public static boolean containsDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4};

        System.out.println(containsDuplicates(nums));
        System.out.println(containsDuplicatesSet(nums));
        System.out.println(containsDuplicatesMaps(nums));

    }

    //using sets method
    public static boolean containsDuplicatesSet(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }

    //using Maps method
    public static boolean containsDuplicatesMaps(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;

    }
}
