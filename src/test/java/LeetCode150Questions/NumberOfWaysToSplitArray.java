package LeetCode150Questions;



public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        long prefixSum = 0;
        int count = 0;

        // Calculate the total sum of the array  , total sum = 13
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate and check for valid splits -The loop runs from 0 to n-2 (i < n-1) because both left and right parts need to be non-empty.
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];                      // Calculate prefix sum  =10
            long suffixSum = totalSum - prefixSum;      // Calculate suffix sum  10-3 = 3
            if (prefixSum >= suffixSum) {               // Condition  Check: 10 >= 3 → ✅ Valid
                count++;                                 // Increment count if valid
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfWaysToSplitArray solution = new NumberOfWaysToSplitArray();
        int[] nums = {10, 4, -8, 7};
        System.out.println("Number of valid splits: " + solution.waysToSplitArray(nums));
    }
}
