package CyclicSortAmazonGoogle;

import java.util.Arrays;

public class SetMisMatchLeetCode645IMP {

    public static void main(String[] args) {
       //int[] nums = {1,2,2,4};
       int[] nums = {3,2,3,4,6,5};

        System.out.println(Arrays.toString(setMismatch(nums)));

    }

    private static int[] setMismatch(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];

        // Step 1: Count occurrences of each number
        for (int num : nums) {
            count[num]++;  // find duplicates
        }

       /* for (int i = 0; i < nums.length; i++) {  // *** OR to find duplicates

            count[nums[i]]++;
        }*/


        int duplicate = -1;
        int missing = -1;

        //Step 2: Find the duplicate (count == 2) and missing (count == 0)

        for (int i = 0; i < nums.length; i++) {

            if(count[i]==2)
            {
                duplicate=i;
            } else if (count[i]==0) {
                missing=i;
            }
        }

      return new int[]{duplicate,missing};

    }

}
