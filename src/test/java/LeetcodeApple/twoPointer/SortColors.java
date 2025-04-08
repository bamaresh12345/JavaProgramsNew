package LeetcodeApple.twoPointer;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {

        int[] nums = {2,0,1};

        System.out.println(Arrays.toString(sortColors(nums)));
    }

    private static int[] sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }


    private static int[] sortColorsCorectit(int[] nums) {

        int[] colors = new int[nums.length];

         int start=0;
         int end = nums.length-1;

         while(start < end)
         {
             if(nums[start]==0)
             {
                 colors[start++] = 0;

             }
             else if(nums[end]==2)
             {
                 colors[end--] =2;

             }

         }

        for (int i = start; i < end; i++) {
            colors[i]=1;
        }

        return colors;
    }
}
