package LeetcodeApple.twoPointer;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums= {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));

    }

    private static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

         Arrays.sort(nums);  // ** IMP lese it will fail
        int k=nums.length-1;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
             j=i+1;

             while(j<k)
             {
                 int sum = nums[i] + nums[j] + nums[k];

                 if(sum==0)
                 {
                     List<Integer> list2 = new ArrayList<>();

                     list2.add(nums[i]);
                     list2.add(nums[j]);
                     list2.add(nums[k]);

                     result.add(list2);
                     j++;
                     k--;
                 }
                 else if(sum < 0)
                 {
                     j++;
                 }
                 else
                 {
                     k--;
                 }
             }


        }

        return new ArrayList<>(result);  // ** IMP give result in () , not in <>** is for datatype
    }
}
