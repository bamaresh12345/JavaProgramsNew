package ServiceCompanyInterviewQuestions;

import java.util.HashSet;

public class missingNumberLeetCode268 {

    public static int findMissingNumber1(int[] nums) {
        int n = nums.length + 1; // Since one number is missing (NO zero)  {1, 2, 4, 5, 6}
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        int finalsum=0;

        for (int num : nums) {
            actualSum += num;
        }
        finalsum = expectedSum - actualSum;
        return finalsum;
    }


    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Total numbers from 1 to n
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Find the missing number by checking which number is not in the set
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // Return -1 if no number is missing (shouldn't happen in a valid case)
    }
    public static void main(String[] args) {
        //int[] nums = {3,0,1};  // sum = 6
        int[] nums = {0, 1, 2, 4}; //sum=20
        System.out.println(findMissingNumber(nums));
        System.out.println(missingnUm2(nums));
    }

    // Method 3

    public static int missingnUm2(int[] num) {
        int arr[] = {1, 4, 3, 5};
  // Arrray sohuld not have duplicates
  // Array no Need to be sorted
  // Values sohuld be in range , frsit and last nubmer with 1 and 5
        int n = arr.length;
        int sum2 = 0;
        int sum1 = 0;
        //int sum1 = (n * (n+1))/2;

        for (int i = 0; i < n; i++) {

            sum1 = arr[i] + sum1;
        }

        //System.out.println(sum1-sum);

        for (int i = 0; i < 5; i++) {

            sum2 = i + sum2;
        }

        int finalsum = sum1 - sum2;
        System.out.println("missing ubmer " + finalsum);

        return finalsum;
    }
}
