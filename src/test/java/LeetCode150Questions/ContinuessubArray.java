package LeetCode150Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuessubArray {

    public static void subArray(int[] arr, int k) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum < 0) {
                sum = 0;
                list.clear();
            }

            if (sum <= k) {
                list.add(arr[i]);

            }

            if (sum > k) {
                list.clear();
            }


        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        //Continuous sub array of [42, 15, 12, 8, 6, 32]
        //whose sum is 26 is 12 8 6
       /* Continuous sub array of [42, 15, 12, 8, 6, 32] whose sum is 26 is   12 8 6
        Continuous sub array of [12, 5, 31, 13, 21, 8] whose sum is 49 is
        5 31 13
        Continuous sub array of [15, 51, 7, 81, 5, 11, 25] whose sum is 41 is
        5 11 25 */

        int[] arr = {12, 5, 31, 13, 21, 8};
        int k = 49;

        subArray(arr, k);


    }
}
