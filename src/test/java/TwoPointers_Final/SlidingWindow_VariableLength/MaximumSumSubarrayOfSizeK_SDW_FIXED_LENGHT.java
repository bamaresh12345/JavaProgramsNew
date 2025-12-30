package TwoPointers_Final.SlidingWindow_VariableLength;
/*
MaximumSumSubarrayOfSizeK_SDW_FIXED_LENGHT problem is same as Maximum Average Subarray I



 */
public class MaximumSumSubarrayOfSizeK_SDW_FIXED_LENGHT {

    public static int maximumSumSubarrayOfSizeK(int[] arr, int k) {
        int left = 0, windowSum = 0, maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[left];
                left++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
                int k=3;

        System.out.println(maximumSumSubarrayOfSizeK(arr,k));
    }
}
