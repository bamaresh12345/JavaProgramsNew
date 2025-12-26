package TlearningWorkDay;

import java.util.Arrays;

import java.util.*;

public class removeDuplicateArrayTest {


    public static Set<Integer> removeDuplicateArray(int[] arr)
    {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);

        }

        System.out.println("HashSet "  + set);

        TreeSet<Integer> tset = new TreeSet<>();

        for (int i=0; i<arr.length; i++)
        {
            tset.add(arr[i]);
        }

        System.out.println("TreeSet " + tset);

        LinkedHashSet<Integer> lset = new LinkedHashSet<>();

        for (int i=0; i<arr.length; i++)
        {
            lset.add(arr[i]);
        }

        return lset;

    }
    public static void main(String[] args) {
        int[] arr = {15, 21, 11, 21, 51, 21, 11 ,8};

        System.out.println("LInkedHAshset  " +removeDuplicateArray(arr));
    }
}
