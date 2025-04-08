package CyclicSortAmazonGoogle;

import java.util.Arrays;

public class cyclicSorting1ToN {

    public static void main(String[] args) {
       int[] arr = {5,4,3,1,2};

       sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        int i = 0;

        while(i < arr.length)
        {
            int currentValue = arr[i]-1; // 1 to n

            if(i < arr.length && arr[i]!=arr[currentValue])
            {
                swap(arr,i,currentValue);
            }
            else
            {
                i++;
            }

        }

    }

    private static void swap(int[] arr, int i, int currentValue) {

        int temp =arr[i];
        arr[i] = arr[currentValue];
        arr[currentValue] =temp;
    }

}
