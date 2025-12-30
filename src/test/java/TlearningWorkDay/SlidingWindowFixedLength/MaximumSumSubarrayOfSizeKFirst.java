package TlearningWorkDay.SlidingWindowFixedLength;

public class MaximumSumSubarrayOfSizeKFirst {
/*
Input: arr = [2,1,5,1,3,2], k = 3
Output: 9   → [5,1,3]

2,1,5 --> 8
1,5,1 --> 7
5,1,3 --> 9 ( this is the output correct)
1,3,2 --> 6

Slidingwindow technique
2 vaarables  , maxSum , windowSum=0
2 varaibles --> left and right
run for() loop till window , collect windowsum
run remaing for() loop till end of the array . to collect remaing sum based of window
from window reduce 1st eloemet and add last element
keep getting the maxSum using math.max() method
return maxSUm of subarray

 */

    public static int maximumSumSubarrayOfSizeK(int[] arr, int k)
    {
        int windowSum=0, maxSum=Integer.MIN_VALUE;  // why this matters it matters for negavite numbers when array is {-2, -1, -3}
        int left=0;


        for (int right = 0; right < arr.length; right++) {

            windowSum = windowSum + arr[right];


            if (right - left + 1 == k) {    //OR // right - left  == k -1  both are same  (2-0 = 2+1 (3) == K(3))
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[left];
                left++;
            }

        }
           return maxSum;

    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        System.out.println(maximumSumSubarrayOfSizeK(arr,k));

    }
}
