package TwoPointersNew;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr)
    {
      int left=0;

      for (int right=0; right<arr.length; right++)
      {
          if(right < arr.length-1  && arr[right]== arr[right+1])
          {
              continue;
          }
          else
          {
              arr[left] = arr[right];
              left++;
          }
      }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
