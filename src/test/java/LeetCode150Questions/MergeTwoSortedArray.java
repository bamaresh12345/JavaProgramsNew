package LeetCode150Questions;

import java.util.*;
 /*
  use  List<Integer> list = new ArrayList<>(); with for loops
  use   TreeSet<Integer> set = new TreeSet<>();; with for loops
*/
public class MergeTwoSortedArray {


    public static void main(String[] args) {
        int[] arr1 = {1,4,7,20};
        int[] arr2 = {3,5,6};

         System.out.println(mergeSortedArrayWithList(arr1,arr2));
        System.out.println(mergeSortedArrayWithSet(arr1,arr2));
        mergeSortedArraysGeneral(arr1,arr2);
    }


    public static void mergeSortedArraysGeneral(int[] arr1, int[] arr2)
    {
        int m= 0;
        int n= 0;
        int p = 0;
        int[] result = new int[arr1.length + arr2.length];
        while(m < arr1.length && n < arr2.length )
        {
            if(arr1[m] <= arr2[n])
            {
                result[p++] = arr1[m++];

            }
            else
            {
                result[p++] = arr2[n++];

            }
        }

        while (m < arr1.length)
        {
            result[p++] = arr1[m++];
        }

        while (n < arr2.length)
        {
            result[p++] = arr1[n++];
        }

        System.out.println("Narmal sort" + Arrays.toString(result));
    }

    // With ArrayList
    public static  List<Integer> mergeSortedArrayWithList(int[] arr1, int[] arr2)
    {

        List<Integer> list = new ArrayList<>();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int i=0;
        for (i=0; i< arr1.length; i++)
        {
            list.add(arr1[i]);
        }

        System.out.println(list);
        for (int j=0; j< arr2.length; j++)
        {
            list.add(arr2[j]);
        }

        System.out.println(list);
        Collections.sort(list);  // **IMP
        return list;

    }

    // With TreeSet
   public static TreeSet<Integer> mergeSortedArrayWithSet(int[] arr1, int[] arr2)

    {
        TreeSet<Integer> set = new TreeSet<>();

        int i=0;
        for (i=0; i< arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        for (int j=0; j< arr2.length; j++)
        {
            set.add(arr2[j]);
        }

        return set;

    }


}
