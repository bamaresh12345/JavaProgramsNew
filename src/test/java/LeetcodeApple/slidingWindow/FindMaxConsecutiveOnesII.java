package LeetcodeApple.slidingWindow;

public class FindMaxConsecutiveOnesII {

    public static void main(String[] args) {

        //int[] nums = {1, 0, 1, 1, 0, 1, 1, 1};
        int[] nums = {1, 0, 1, 1, 0};

        System.out.println(findMaxConsecutiveOnesII(nums));
    }

    private static int findMaxConsecutiveOnesII(int[] nums) {

        int left=0;
        int maxCount=0;
        int zeroCount=0;

        for (int right = 0; right < nums.length; right++) {

            if(nums[right]==0)
            {
                zeroCount++;

            }

            while (zeroCount >1) // more htan 1 zero shrink the window
            {
                if(nums[left]==0)
                {
                    zeroCount--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, right -left +1);
        }
       return maxCount;
    }
}
