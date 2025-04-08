package LeetCode150Questions;

public class FindLengthofSubArray {

    public static int findLengthofSubArray(int[] nums,int k)
    {
        int left=0;
        int sum=0;
         int maxLen=0;
        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            if(sum >k)
            {
                sum = sum - nums[left];
                left++;
            }

            maxLen = Math.max(maxLen,right -left + 1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
       int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
       int k = 8;

        System.out.println(findLengthofSubArray(nums,k));
    }
}
