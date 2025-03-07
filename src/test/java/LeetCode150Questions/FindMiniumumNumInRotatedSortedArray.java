package LeetCode150Questions;

/*
https://www.youtube.com/watch?v=bkJeA7LnJww
153. Find Minimum in Rotated Sorted Array
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times. or [0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Input: nums = [3,4,5,1,2] Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
public class FindMiniumumNumInRotatedSortedArray {

    public static int findMiniumumNumInRotatedSortedArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] > nums[right])  // if arr[mid] greater than left = mid+1, you divied array into 2 hals
            {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        System.out.println(findMiniumumNumInRotatedSortedArray(nums));
        System.out.println(findMiniumumNumInRotatedSortedArrayAB(nums));
    }

    public static int findMiniumumNumInRotatedSortedArrayAB(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min)
                min = nums[i];
        }

        return min;
    }
}