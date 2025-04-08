package CyclicSortAmazonGoogle;

import java.util.Arrays;

public class miissingNumber0ToNLeetCode268IMP {

    public static void main(String[] args) {
       //int[] nums = {3, 0, 1};  //2
      // int[] nums = {0, 1};  //2
       int[] nums = {9,6,4,2,3,5,7,0,1}; //8
      // int[] nums = {4,3,2,7,8,2,5,3,1};

       // System.out.println(missingNubmer(nums));
        System.out.println(missingNnbmer2(nums));

    }



    private static int missingNubmer(int[] nums) {

        int n = nums.length+1; // +1 if it ssstarts from 1 , if its starts from 0 no need to have +1
        int sum = (n * (n +1))/2;

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }

    private static int missingNnbmer2(int[] nums) {

        int i=0;

        while(i < nums.length)
        {
         int currentEelement = nums[i]; // nums[i]-1 , if it strats from 1 if its srats from 0 it will be nums[i]

            if(nums[i] < nums.length &&   nums[i]!=nums[currentEelement])  /// *** nums[i] <   not i <
            {
                swap(nums,i,currentEelement);
            }
            else {
                i++;
            }

        }

        System.out.println(Arrays.toString(nums));
        int index=0;
        for ( index = 0; index < nums.length; index++) {

            if(index !=nums[index])
                return index;   // Index is imp , not nums[index] , gives missing nubmer
        }

        return index;  // *** IMP
    }

    public static void swap(int[] nums,int i,int currentEelement)
    {
        int t= nums[i];
        nums[i] = nums[currentEelement];
        nums[currentEelement] = t;
    }
}
