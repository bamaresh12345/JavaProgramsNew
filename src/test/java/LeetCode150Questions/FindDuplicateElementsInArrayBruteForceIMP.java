package LeetCode150Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsInArrayBruteForceIMP {

    // Time complexity is O(n pwr 2)  ,because two for loops
    public static void findDuplicateElementsInArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;  // wont WORK
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("duplicate element in Array : " + arr[j]);
                    //count++;   wont WORK
                    break;
                    //return arr[i]; // only if one duplicate element to find

                }
                // need count then need to go for HashMap easy way
            }
            //WONT WORK
          /*  System.out.println("duplicate element in Array : " + arr[i]);
            System.out.println("duplicate element in count : " + count);*/
        }

    }


    // Time complexity is O(n)   ///*MP LeetCode
    public static void findDuplicateElementsInArrayUsingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();  //  Set<String>  if its String array

        for (int i = 0; i < arr.length; i++) {
            // if(!set.add(arr[i]))  // *** IMP ! set.add()  OR
            if (set.add(arr[i]) == false)  // *** IMP ! set.add()  OR
            {
                System.out.println("duplicate element is : " + arr[i]);
                //return arr[i]; // only if one duplicate element to find
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2, 6, 7, 8, 6};

        String[] str = {"java", "python", "java"};  // find duplicates from String Array Same for loops, no change

        System.out.println("\n******Using BrueForce**********\n");
        findDuplicateElementsInArray(arr);
        System.out.println("\n******Using HashMap**********\n");
        findDuplicateElementsInArrayHashMap(arr);
        System.out.println("\n******Using Hashset**********\n");
        findDuplicateElementsInArrayUsingHashSet(arr);

    }

    // ** IMP****** NOT for LEETCODE
    public static void findDuplicateElementsInArrayHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();  //  Map<String,Integer>  if its String array

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                int k = map.get(arr[i]);
                map.put(arr[i], k + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int largestValue = 0, largestKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
/*
            if(entry.getValue() >1)
            {
                System.out.println("duplicate key : " + entry.getKey() + " duplicate count : " + entry.getValue());
            }*/

            if (entry.getValue() > largestValue) {
                largestValue = entry.getValue();
                largestKey = entry.getKey();
            }

        }
        System.out.println("largestKey key : " + largestKey + " largestValue : " + largestValue);  // largestKey *** IMP
    }


}
