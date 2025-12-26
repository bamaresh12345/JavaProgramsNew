package TlearningWorkDay;

import java.util.Arrays;

public class MOveZeros {

    public static int[] moveZerostoRight(int[] nums)
    {

        int count=0;
        int left =0, right=0;

        for (right=0; right<nums.length; right++)
        {
            if(nums[right]!=0)
            {
                nums[count]=nums[right];
                count++;
            }
        }

        for (int i=count; i<nums.length; i++)
        {
            nums[i]=0;
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3,0,34,0, 9, 12};

        System.out.println(Arrays.toString(moveZerostoRight(nums)));
    }
}
