package TwoPointers_Final;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] arr,int k)
    {
        int right = arr.length;
        int left=0;
        reverse(arr, left,right-1);
        reverse(arr, left,k-1);
        reverse(arr, k,right-1);

        return arr;
    }

    public static void reverse(int[] arr,int left, int right)
    {
        while(left <= right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left++;   // VERY IMP***
            right--;  // VERY IMP***

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int  k = 3;

        System.out.println(Arrays.toString(rotateArray(arr,k)));
    }
}
