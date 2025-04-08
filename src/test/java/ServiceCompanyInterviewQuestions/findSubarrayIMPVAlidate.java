package ServiceCompanyInterviewQuestions;

public class findSubarrayIMPVAlidate {

    public static void findSubarray(int[] arr, int target) {
        int left = 0;
        int  currentSum = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            // Shrink the window from the left if the sum exceeds the target
            while (currentSum > target && left <= right) {  // *** IMP only  && left <= right
                currentSum = currentSum - arr[left];
                left++;
            }

            // Check if we found the subarray
            if (currentSum == target) {
                System.out.println("Subarray found from index " + left + " to " + right); // PRINT left to right
                for (int i = left; i <=right; i++) {    // PRINT left to right
                    System.out.print(arr[i] + " ");
                }
                return;
            }
        }
        System.out.println("No subarray found with sum " + target);
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 20, 3, 10, 5};
        int target = 33;
        findSubarray(nums, target);
    }
}
