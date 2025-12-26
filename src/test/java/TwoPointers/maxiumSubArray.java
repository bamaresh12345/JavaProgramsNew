package TwoPointers;

public class maxiumSubArray {

    public static int MaxiumSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if (sum < 0)
                sum = 0;

            maxSum = Math.max(sum,maxSum);


        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, -7, -1};
        System.out.println(MaxiumSubArray(nums));
    }
}
