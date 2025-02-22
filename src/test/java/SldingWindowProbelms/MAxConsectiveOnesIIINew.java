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
public class MAxConsectiveOnesIIINew {

    public static int maxxConsectiveOnesIIINew(int[] nums, int k) {
        //Go with two pointer concept
        int counter = 0; //to count the zeros
        int left = 0; // to point to 1st element of array
        int right = 0; //to point to 1st element of array and explore next elments
        int n = nums.length; // get the length of array
        int maxLen = 0; //to store the maxLenght of 1's

        while (right < n) // run while loop till right pointer reaches to end of array
        {
            if (nums[right] == 0) // check if the arr value is zero , if yes incrment the counter
            {
                counter++;
            }

            while (counter > k) // check if the counter is greater than k
            {
                if (nums[left] == 0) {
                    counter--;  // decrment the zeros
                }
                left++;  // incrment the left pointer
            }

            maxLen = Math.max(maxLen, right - left + 1);

            right++;

        }

        return maxLen;
    }

    public static void main(String[] args) {


        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        //int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};  //6 output
        //int k = 2;

        System.out.println(maxxConsectiveOnesIIINew(nums, k));

    }

}


