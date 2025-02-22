package ArraysLeetCodeFinalMedium;

import java.util.*;

/* 15. 3Sum Medium
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and
j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1: Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1] Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3: Input: nums = [0,0,0] Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */
public class ThreeSumLeetCode15Medium {
/*
1. check if nums.length < 3 , return new ArrayList<>();
2. delacre a set to store results and it should have all unique integers
3. decialre 3 pointers i=0, j=i+1 and k = last element  nusm.length-1
4. sort the array Arrays.sort(nums)
4. run for loop till end of array -2 , because k is poitning to last element and j go till n-1
5. use while loop till (j < k)
6 .check sum = nums[i] + nums[j] + nums[k] is eaula to zero
7. if yes add all elements to list list.add(nums[i,j,k])
8. else sum > 0  then decrment k--;
9. if sum <0 then incrmetn j ++
10. finally return new ArraList<Integer>(result)
*/

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> result = new HashSet<>(); // IMP** Set<List<Integer>>
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> list = new ArrayList<>();
                if (sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    result.add(list);
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums = {-1, 0};

        System.out.println(threeSum(nums));
    }
}
