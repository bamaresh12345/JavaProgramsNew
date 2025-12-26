package TwoPointersNew;

import java.util.Arrays;

public class TwoSumIIArrayIsSorted {

    public static int[] twoSumII(int[] arr , int t)
    {
        int left=0;
        int right=arr.length-1;
        int sum=0;

        while(left < right)
        {
           sum= arr[right] +arr[left];

           if(sum==t)
           {
               return new int[] {left+1, right+1};
           }
           else if(sum < t)
           {
               left++;
           }
           else
           {
               right--;
           }
        }



        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;

        System.out.println(Arrays.toString(twoSumII(arr,target)));
    }

}
