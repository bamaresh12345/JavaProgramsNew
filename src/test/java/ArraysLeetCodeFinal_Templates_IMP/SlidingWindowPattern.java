package ArraysLeetCodeFinal_Templates_IMP;

public class SlidingWindowPattern {
    /*  TWO POINTER /SLIDING WINDOW / CONSTANT WINDOW
    array can have postive and negative nubmers
    k=4 , if takes 4 elements consitively waht is maxium sum, you will get it
    [-1,2,3,4,4,5,-1]  and k=4
    left=right=0 , k=4 and n = nums.length

     */
    public static void main(String[] args) {

        //
        // int[] nums = {-1, 2, 3, 4, 4, 5, -1};  // any array with +ve and -ve numbeers
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // any array with +ve and -ve numbeers
        int k = 4; // pick up  4 consitive elments  or contiions on the array subarrray lenghts =4 or

        int currSum = 0;
        int maxSum = 0;


        for (int i = 0; i < k; i++) {
            currSum = currSum + nums[i];
        }
        currSum = 0;
        System.out.println("currSum: " + currSum);

        for (int i = k; i < nums.length; i++) {

            //currSum = currSum - nums[i - k];
            //  i++;
            currSum = currSum + nums[i];

            if (currSum < 0)
                currSum = 0;

            maxSum = Math.max(currSum, maxSum);

        }

        System.out.println(maxSum);

        //instead of 2nd for loop , can run the while loop
        int left = 0;
        int right = k - 1; //pointing to right kth elment
        int n = nums.length;
        int currSum1 = 0, maxSum1 = 0;
        while (right < n - 1) { // very IMP n-1 elese will be Array out of bound
            currSum1 = currSum1 - nums[left];
            left++;
            right++;

            currSum1 = currSum1 + nums[right];

            maxSum1 = Math.max(currSum1, maxSum1);

        }

    }
}
