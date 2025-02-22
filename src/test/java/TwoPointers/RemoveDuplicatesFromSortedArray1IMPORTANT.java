package TwoPointers;
/*
26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements
in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in
nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1: Input: nums = [1,1,2]  Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]  Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveDuplicatesFromSortedArray1IMPORTANT {

    /*
       0. declare valruiave count=0 , to store the index of array without duplicate elements
       1. run for loop till end of array
       2. check if the ith element < lenght of array -1 and arry of i == array of i+1
       3. then continue
       4 else push that array value to positons w.r.t count and increment the count+
       5. finally return the count;
     */

    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count++] = nums[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {


        int[] nums = {1, 1, 2};

        System.out.println(removeDuplicatesFromSortedArray(nums));

    }


}
