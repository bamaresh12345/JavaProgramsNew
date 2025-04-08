package CyclicSortAmazonGoogle;


import java.util.*;

public class FindAllNumbersDisappearedInArrayLeetCode448 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findAllNumbersDisappearedInArray(nums));
    }

    public static List<Integer> findAllNumbersDisappearedInArray(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (!set.add(nums[i])) {
                list.add(nums[i]);
            }
        }

        return list;


    }



}
