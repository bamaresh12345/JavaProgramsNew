package TwoPointers_Final;

import java.util.Arrays;

public class RemoveElement {

    public static int[] removeElement(int[] arr,int  val)
    {
        int left=0;
        int right=0;
        for (right=0; right<arr.length; right++)
        {
            if(arr[right]!=val)
            {
                arr[left]=arr[right];
                left++;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
       int[] arr = {3,2,2,3};
        int val = 3;

        System.out.println(Arrays.toString(removeElement(arr,val)));


    }
}
