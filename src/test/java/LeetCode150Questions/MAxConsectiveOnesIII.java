package LeetCode150Questions;

/*  487. Max Consecutive Ones II
https://www.youtube.com/watch?v=vLsRew-ABVs --> Nikhil explains better
https://www.youtube.com/watch?v=ROuOZongV6I--> just coding
Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
 */
public class MAxConsectiveOnesIII {

    public static int maxConsitiveOnesII(int[] nums, int k) {

        int flippedZeroCount = 0, maxLen = 0;
        int Left = 0, Right = 0;
        int n = nums.length;

        //find the consitve ones
        while (Right < n) {
            //if condition ****
            if (nums[Right] == 0) {
                flippedZeroCount++;
            }

            //contract window if we dont meet the condition
            while (flippedZeroCount > k) {
                if (nums[Left] == 0) {
                    flippedZeroCount--;
                }
                Left++;
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, Right - Left + 1);

            //move the R one to the right
            Right++;
        }

        return maxLen;


    }

    public static void main(String[] args) {

        //int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 3;

        System.out.println(maxConsitiveOnesII(nums, k));
    }


}
