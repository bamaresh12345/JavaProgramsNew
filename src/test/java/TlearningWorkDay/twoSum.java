package TlearningWorkDay;

import java.util.Arrays;

public class twoSum {

    public static int[] twoSum(int[] nums, int target)
    {

        for (int i=0; i<nums.length; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j]==target)
                    return new int[] {i,j};

            }
        }


       return new int[] {-1,-1};
    }

    public static int[] twoSumBinaryApp(int[] nums, int target)
    {
           int left=0;
           int right=nums.length-1;

           while(left < right)
           {
               int sum = nums[left] + nums[right];
               if(sum < target)
               {
                  nums[left]++;
               }
               else if(sum > target)
                   nums[right]--;
               else
                   return new int[] {left,right};
           }

        return new int[] {-1,-1};
    }
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(numbers,target)));
        System.out.println(Arrays.toString(twoSumBinaryApp(numbers,target)));
    }
}
