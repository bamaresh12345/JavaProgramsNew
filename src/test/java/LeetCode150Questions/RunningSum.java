package LeetCode150Questions;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];

        // Initialize the first element
        runningSum[0] = nums[0];

        // Calculate running sum for the rest of the elements
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];  /*runningSum[0] = 1
                                                            runningSum[1] = 1 + 2 = 3
                                                            runningSum[2] = 3 + 3 = 6
                                                            runningSum[3] = 6 + 4 = 10
                                                            ✅ Output → [1, 3, 6, 10] */
        }

        return runningSum;

    }

    public static void main(String[] args) {
        RunningSum solution = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
