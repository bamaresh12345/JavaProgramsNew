package TwoPointer;

public class maxiumSubArray {

    public static int MaxiumSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if (sum < 0)
                sum = 0;

            if (sum > maxSum)
                maxSum = sum;


        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -5, 6, -2, -3, 1, 5, -6};
        int k = 3;
        System.out.println(MaxiumSubArray(nums));
    }
}
