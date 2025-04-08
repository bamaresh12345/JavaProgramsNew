package CyclicSortAmazonGoogle;

import java.util.Arrays;

public class cyclicSorting0ToN {

    public static void main(String[] args) {
        int[] arr = {3,1,5,0,4,2};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        int index=0;

        while(index < arr.length)
        {
            int current = arr[index];

            if(index < arr.length && arr[index]!=arr[current])
            {
                swap(arr,index,current);
            }
            else
            {
                index++;
            }

        }

    }

    private static void swap(int[] arr, int index, int current) {
        int temp = arr[index];
        arr[index] = arr[current];
        arr[current] =temp;
    }
}
