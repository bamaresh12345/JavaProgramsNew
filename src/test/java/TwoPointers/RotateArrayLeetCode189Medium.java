package TwoPointers;

import java.util.Arrays;
/*
You are given: An integer array nums  and An integer k

Task:
Rotate the array to the right by k steps, where k is non-negative.
Rotation means every element moves k positions to the right.
Elements that “fall off” the end wrap around to the beginning.
🔑 Important Notes
Rotation is circular.
You cannot use extra space proportional to n (for in-place solution).

🟢 Example 1
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
Step 1: Move last 3 elements [5,6,7] to the front
Step 2: Shift [1,2,3,4] right
Result: [5,6,7,1,2,3,4]

🟢 Example 2
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
Step 1: Last 2 elements [3,99] move to front
Step 2: Shift [-1,-100] right
Result: [3,99,-1,-100]

🟢 Approach 2: In-Place Using Reverse (Optimal)
Idea: Reverse entire array
Reverse first k elements
Reverse remaining n - k elements
Why it works: Reversing moves the last k elements to front while keeping order.
 */
public class RotateArrayLeetCode189Medium {

    public static void RotateArray(int[] nums, int k) {
        int i = 0;
        int n = nums.length;  // gives total length starting from index 1 , not from index 0
        reverseArray(nums, 0, n - 1);  //  give n-1 , since the length of array is 1 to n = line 42
        reverseArray(nums, 0, k - 1);  // give n-1 , since the length of array is 1 to n  = line 42
        reverseArray(nums, k, n - 1);       // give n-1 , since the length of array is 1 to n  = line 42
        System.out.println(Arrays.toString(nums));

    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray(nums, k);

    }
}
