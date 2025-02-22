package ServiceCompanyInterviewQuestions;

public class printSumOfAllSubArrays {

    public static void printSumOfAllSubArrays(int[] nums, int target) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;

        while (right < n) {

            sum = sum + nums[right];

            while (sum >= target) {

                sum = sum - nums[left];
                left++;

                if (sum == target) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println(); // *** IMP***
                }
            }

            right++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //int[] nums = {1, 4, 4};
        //int target = 4;

        printSumOfAllSubArrays(nums, target);
    }
}
