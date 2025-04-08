package LeetcodeApple.slidingWindow;

public class FindMaxConsecutiveOnesIII {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println(findMaxConsecutiveOnesIII(nums,k));
    }

    private static int findMaxConsecutiveOnesIII(int[] nums, int k) {

        int left=0;
        int zerosCount=0;
        int maxLen=0;

        for (int right = 0; right < nums.length; right++) {

            if(nums[right]==0)
            {
                zerosCount++;
            }

            while(zerosCount > k)
            {
                if(nums[left]==0)
                {
                    zerosCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);

        }

        return maxLen;
    }
}
