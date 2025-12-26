package TwoPointersNew;

import java.util.Arrays;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2,int m,int n)
    {
       int i=m-1;
       int j= n-1;
       int k= m+n-1;
    /*
    while (i > 0 && j > 0)
    ❗ Why this is wrong
    Array indexes start at 0
    When i == 0 or j == 0, index 0 is still a valid element
    Your loop skips index 0, so first elements are never compared/copied
     */
       while(i>=0 && j>=0)
       {
           if(arr1[i] > arr2[j])
           {
               arr1[k] = arr1[i];
               i--;
               k--;
           }
           else
           {
               arr1[k] = arr2[j];
               k--;
               j--;
           }
       }

       while (i > 0)
       {
           arr1[k--] = arr1[i--];
       }

        while (j > 0)
        {
            arr1[k--] = arr2[j--];
        }

        System.out.println(Arrays.toString(arr1));
        return arr1;
    }
    public static void main(String[] args) {

       /* int[] arr1 = {1,2,3,0,0,0};
         int m = 3;
         int[] arr2 = {2,5,6};
         int n = 3;*/

        int[] arr1 = {1,3,5,0,0,0};
        int m = 3;
        int[] arr2 = {2,4,6};
        int n = 3;
        System.out.println(mergeSortedArray(arr1,arr2,m,n));
    }
}
