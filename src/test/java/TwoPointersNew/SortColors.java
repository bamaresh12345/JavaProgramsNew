package TwoPointersNew;

import java.util.Arrays;

public class SortColors {

    public static int[] sortColors(int[] arr)
    {
       for (int i=0; i<arr.length; i++)
       {
           for (int j=i+1; j<arr.length; j++)
           {
               if(arr[i] > arr[j])
               {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }


        return arr;
    }
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        System.out.println(Arrays.toString(sortColors(arr)));

    }
}
