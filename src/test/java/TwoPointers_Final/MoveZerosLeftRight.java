package TwoPointers_Final;

import java.util.Arrays;

public class MoveZerosLeftRight {

    public static int[] moveZerosLeft(int[] arr)
    {
        int left=0;
        int right=0;

        for (right=0; right < arr.length; right++)
        {
            if(arr[right]!=0)
            {
                arr[left]=arr[right];
                left++;
            }

        }

        for (int i=left; i<arr.length; i++)
        {
            arr[i]=0;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        System.out.println(Arrays.toString(moveZerosLeft(arr)));
        System.out.println(Arrays.toString(moveZerosright(arr)));
    }

    public static int[] moveZerosright(int[] arr)
    {
        int left = arr.length-1;
        int right = arr.length-1;

        for (right = arr.length-1; right >=0; right--)
        {
            if(arr[right] !=0)
            {
                arr[left] = arr[right];
                left--;
            }
        }

      for ( int i=left; i>=0; i--)
      {
          arr[i]=0;
      }

        return arr;
    }
}
