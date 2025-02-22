package ArraysLeetCodeFinalMedium;

import java.util.*;

public class findCommonElelments {


    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {

            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else
                map.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {

            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) + 1);
            } else
                map.put(arr2[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Uniqueelements in Array " + entry.getKey());
            }
        }
    }
}
