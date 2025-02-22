package LeetCode150Questions;

import java.util.*;

/*
[15, 21, 11, 21, 51, 21, 11]
[51, 21, 11, 15]
[11, 15, 21, 51]
[15, 21, 11, 51]

          Set<String> set11 = new TreeSet<>();  //--> retains the insertion order, helps to remove dupplicats from String
        String s = "I am am amar amar";  // Set<String> set = new TreeSet<>()  retains order
        Set<String> set12 = new LinkedHashSet<>(); //--> retains the insertion order, helps to remove dupplicats from String
 */
public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicateArray(int[] arr) {

        System.out.println(Arrays.toString(arr));

        //HashSet<>() --> does not retains the insertion order, helps to remove dupplicats from Integer
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        //tset = new TreeSet<>();--> retains the insertion order, helps to remove dupplicats from Integer
        Set<Integer> tset = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            tset.add(arr[i]);
        }

        System.out.println(tset);
        //lset = new LinkedHashSet<>()--> retains the insertion order, helps to remove dupplicats from integer

        Set<Integer> lset = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            lset.add(arr[i]);
        }

        System.out.println(lset);

        int[] arr2 = new int[lset.size()];
        int k = 0;
        for (int x : lset) {
            arr2[k] = x;
            k++;
        }
        return arr2;


    }

    public static void main(String[] args) {

        //int[] arr = {4, 3, 2, 4, 9, 2 };
        int[] arr = {15, 21, 11, 21, 51, 21, 11};

        System.out.println("asdfasdf --> " + Arrays.toString(removeDuplicateArray(arr)));

    }
}
