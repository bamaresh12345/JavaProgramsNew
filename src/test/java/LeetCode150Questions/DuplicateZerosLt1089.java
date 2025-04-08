package LeetCode150Questions;

import java.util.Arrays;

/*
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */
public class DuplicateZerosLt1089 {

    public static int[] duplicateZeros(int[] arr) {
        int zeros=0;
        for(int x : arr)
        {
            if(x==0)
            {
                zeros++;
            }
        }
        int i = arr.length-1;
        int j= arr.length-1+zeros;

        while(i<j)
        {
           if(j < arr.length)
           {
               arr[j] = arr[i];
           }
            j--;


            if(arr[i]==0) {
                if (j < arr.length)
                {
                    arr[j]=0;
                }

                j--;
            }
            i--;
        }

        return arr;

    }

    private static void replace(int i, int j, int[] arr)
    {
        if(j<arr.length)
        {
            arr[j]=arr[i];
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,5,0};

        System.out.println(Arrays.toString(duplicateZeros(arr)));
    }
}
