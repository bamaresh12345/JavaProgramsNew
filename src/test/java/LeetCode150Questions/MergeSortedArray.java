package LeetCode150Questions;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public static List<Integer> mergeSortedArray(int[] arr1, int[] arr2)
    {
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length)
        {

            if(arr1[i] < arr2[j])
            {
                list.add(arr1[i]);
                i++;
            }
            else
            {
                list.add(arr2[j]);
                j++;
            }

        }

        while(i< arr1.length)
        {
            list.add(arr1[i]);
            i++;
        }

        while(j< arr1.length)
        {
            list.add(arr1[j]);
            j++;
        }

        return list;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,7,20};
        int[] arr2 = {3,5,6};

        System.out.println(mergeSortedArray(arr1,arr2));
    }
}
