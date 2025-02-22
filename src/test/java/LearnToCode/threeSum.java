package LearnToCode;

import java.util.*;

public class threeSum {
    /*
    1. need 3 pointers , i=0, j=i+1 and k=nums.length-1;
    2. run while loop till k <=0
    3. declare sum and add (nums[i] + nums[j] + nums[i])
    4. check if sum =0 , then add nums[i],nums[j] and nums[k] into arrayList (delcare one more arrayList and add it)
    5. else sum < 0 , then incrment j++
    6. else sum > 0 , then decrment k--;
    7. at the end of while loop
    8. return arrayList

     */
    public static List<List<Integer>> threeSumMethod(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    result.add(list);
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }


        return new ArrayList<List<Integer>>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSumMethod(nums));
    }
}
