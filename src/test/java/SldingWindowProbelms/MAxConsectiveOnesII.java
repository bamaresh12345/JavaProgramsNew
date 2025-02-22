package SldingWindowProbelms;

/*  487. Max Consecutive Ones II
Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
 */
public class MAxConsectiveOnesII {

    public static int maxConsitiveOnesII(int[] nums) {

        int count = 0, maxLen = 0;
        int L = 0, R = 0;
        int n = nums.length;

        //find the consitve ones
        while (R < n) {
            if (nums[R] == 0) {
                count++;
            }

            //contract window if we dont meet the condition
            while (count > 1) {
                if (nums[L] == 0) //decrease count only when left pointer is pointing to 0
                {
                    count--;
                }
                L++;   // increment left counter if the counter is > 1
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, R - L + 1);

            //move the R one to the right
            R++;
        }

        return maxLen;


    }

    public static void main(String[] args) {

        //int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 0, 1, 1, 0};

        System.out.println(maxConsitiveOnesII(nums));
    }


}
