package CyclicSortAmazonGoogle;

import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateNumber287LeetCode {

    public static int findDuplicate(int[] nums) {

        Set<Integer> set= new HashSet<>();  //  Set<String>  if its String array

        for(int i=0; i<nums.length; i++)
        {
            if(set.add(nums[i])==false)  // *** IMP ! set.add()
            {

                return nums[i]; // only if one duplicate element to find
            }
        }


        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }

}
