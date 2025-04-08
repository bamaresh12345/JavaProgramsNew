package CyclicSortAmazonGoogle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArrayLeetCode442 {

    public static List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (!set.add(nums[i])) {
                list.add(nums[i]);
            }
        }

        return list;


    }
    public static void main(String[] args) {
   int[]  nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
