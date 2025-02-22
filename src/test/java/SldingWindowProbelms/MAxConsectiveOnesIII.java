package SldingWindowProbelms;

/* 1004. Max Consecutive Ones III Medium
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the
array if you can flip at most k 0's.

Example 1: Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2  Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2: Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3 Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
public class MAxConsectiveOnesIII {

    public static int maxConsitiveOnesIII(int[] nums, int k) {

        int counter = 0, maxLen = 0;
        int L = 0, R = 0;
        int n = nums.length;

        //find the consitve ones
        while (R < n) {
            if (nums[R] == 0) {
                counter++;
            }

            //contract window if we dont meet the condition
            while (counter > k) {
                if (nums[L] == 0) //decrease counter only when left pointer is pointing to 0
                {
                    counter--;
                }
                L++;   // increment left counter if the counter is > 1
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, R - L + 1);

            //move the R one to the right
            R++;
        }

        return maxLen;


    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        //int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 10};  //6 output
        //int k = 2;

        System.out.println(maxConsitiveOnesIII(nums, k));
    }


}
