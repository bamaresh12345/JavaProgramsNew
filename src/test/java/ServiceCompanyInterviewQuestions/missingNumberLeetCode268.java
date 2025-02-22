package Numbers;

public class missingNumberLeetCode268 {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;  // +1
        System.out.println(sum);

        for (int i = 0; i < nums.length; i++) {   // nums.length is very imp lest it will for array out of bond

            sum = sum - nums[i];
        }

        System.out.println("missing number : " + sum);

        return sum;
    }

    public static void main(String[] args) {
        //int[] nums = {3,0,1};  // sum = 6
        int[] nums = {0, 1, 2, 4}; //sum=20
        System.out.println(missingNumber(nums));
    }
}
