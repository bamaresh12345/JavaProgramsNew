package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class FindContinuesSubArrayInArrayWoseumEqaulToNumber {


    static void findSubArray(int[] arr, int target) {
        //Initializing sum with the first element of the arr
        int sum = arr[0];

        //Initializing starting point with 0
        int start = 0;

        //Iterating through arr starting from second element
        for (int i = 1; i < arr.length; i++) {
            //Adding arr[i] to the current 'sum'
            sum = sum + arr[i];

            //If sum is greater than target then following loop is executed until

            //sum becomes either smaller than or equal to target

            while (sum > target) {
                //Removing starting elements from the 'sum'

                sum = sum - arr[start];
                //Incrementing start by 1
                start++;
            }


            //If 'sum' is equal to 'target' then printing the sub array
            if (sum == target) {
                // System.out.println("Continuous sub array of " + Arrays.toString(arr) + " whose sum is " + target + " is ");

                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);


        //int[] arr = {42, 15, 12, 8, 6, 32};
        //int target = 26;
        int[] arr = {2, 4, 2, 8, 3, 3, 2, -4, 12};
        int target = 8;
        continuesSubArray(arr, target);
    }

    public static void continuesSubArray(int[] arr, int target) {
        int left = 0, right = 0;
        int sum = 0;
        boolean b = false;
        while (right < arr.length) {
            sum = sum + arr[right];

            if (sum > target) {
                sum = sum - arr[left];
                left++;

            }


            if (sum == target) {
                for (int j = left; j <= right; j++) {
                    System.out.print(arr[j] + " ");
                }
                b = true;
            }

            right++;


        }

        if (b == false) {
            System.out.println("No sub Array ");

        }
    }
}
