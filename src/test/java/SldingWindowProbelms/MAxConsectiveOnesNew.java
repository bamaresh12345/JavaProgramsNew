package SldingWindowProbelms;

public class MAxConsectiveOnesNew {

/*  485. Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Input: nums = [1,1,0,1,1,1] Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Input: nums = [1,0,1,1,0,1] Output: 2




 */

    public static int maxNumersofOnes(int[] arr) {
        int counter = 0; // to count the nubmer of 1's
        int maxlen = 0; // to store continues 1's

        for (int i = 0; i < arr.length; i++) {  // run for loop till end of array

            if (arr[i] == 1)  // check if arr of value is eaul to 1 then
            {
                counter++;   // incrment the counter
                maxlen = Math.max(maxlen, counter);  // pick the maxvalue length
            } else {
                counter = 0;   // make counter =0 so that the counter again starts from next 1.
            }

        }


        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1};

        System.out.println(maxNumersofOnes(arr));
    }
}
