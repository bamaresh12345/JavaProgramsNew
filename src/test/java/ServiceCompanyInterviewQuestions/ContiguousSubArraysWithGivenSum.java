package ServiceCompanyInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class ContiguousSubArraysWithGivenSum {
    private static void hashingMethod(int[] arr, int target) {
        System.out.println("Given Array : " + Arrays.toString(arr));
        System.out.println("Given Sum : " + target);
        System.out.println("Contiguous Sub Arrays With Sum " + target + " Are : ");

        //Initializing sum to 0

        int sum = 0;

        //Defining map with sum as keys and index as values

        HashMap<Integer, Integer> map = new HashMap<>();
        //Inserting 0 as key and 1 as value into map
        map.put(0, -1);

        //Iterating each element of arr
        for (int i = 0; i < arr.length; i++) {
            //Adding current element to sum
            sum = sum + arr[i];

            //Checking whether map contains (sum - target)
            if (map.containsKey(sum - target)) {
                //If it contains, printing sub array
                printSubArray(arr, map.get(sum - target) + 1, i);
            }

            //Inserting sum as key and i as its value into map
            map.put(sum, i);
        }
    }

    //Utility Method To Print Sub Array

    private static void printSubArray(int[] inputArray, int start, int end) {
        System.out.print("[");

        for (int i = start; i <= end; i++) {
            System.out.print(" " + inputArray[i]);
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {
        hashingMethod(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);

        System.out.println("=====================================");

        hashingMethod(new int[]{5, -9, 4, -2, 7, 1, -4, -3, -7}, -7);

        System.out.println("=====================================");

        hashingMethod(new int[]{7, 3, 6, 5, 21, -6, -15, 28, 8}, 21);
    }
}
