package LearnToCode;

public class MaxiumSubArray {

    /*
     1. Delcare sum variable to 0
     2. run for loop till end of array
     3. keep summing each array ellment to sum
     4. cehck if sum <0
     5, then set sum=0
     6. check sum > maxSum then
     7. assign maxSum = sum
     8. at the end of for loop finally return maxSum

     */
    public static int maxiumSubArray(int[] nums) {
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
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxiumSubArray(nums));
    }
}
