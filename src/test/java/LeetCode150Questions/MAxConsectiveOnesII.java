package LeetCode150Questions;

/*  487. Max Consecutive Ones II
https://www.youtube.com/watch?v=vLsRew-ABVs --> Nikhil explains better
https://www.youtube.com/watch?v=ROuOZongV6I--> just coding

487. Max Consecutive Ones II
Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.

 */
public class MAxConsectiveOnesII {

    public static int maxConsitiveOnesII(int[] nums) {

        int zeroscount = 0, maxLen = 0;
        int Left = 0, Right = 0;
        int n = nums.length;

        //find the consitve ones
        for (int right = 0; right < nums.length; right++) {

           //if condition ****
            if (nums[Right] == 0) {
                zeroscount++;
            }

            //contract window if we dont meet the condition
            while (zeroscount > 1) {
                if (nums[Left] == 0) {
                    zeroscount--;
                }
                Left++;
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, Right - Left + 1);
        }

        return maxLen;


    }

    public static void main(String[] args) {

        //int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 1, 1, 1, 0};

        System.out.println(maxConsitiveOnesII(nums));
    }


}
