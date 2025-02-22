package ArraysLeetCodeFinalMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 2150. Find All Lonely Numbers in the Array
You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent
numbers (i.e. x + 1 and x - 1) appear in the array.
Return all lonely numbers in nums. You may return the answer in any order.
Example 1: Input: nums = [10,6,5,8] Output: [10,8]

Explanation:
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.

Example 2: Input: nums = [1,3,5,3] Output: [1,5]
Explanation:
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.
 */
public class FindAllLonelyNumbersInTheArrayLeetcode2150 {

    /*
    1. create hasMap and store elments with frequency in array
    2. run Map>entry for loop till end of array
    3. check entry.getValue()==1
    4. if yes , get key x = entry.getKey()
    5. check for if condiction  map.containsKey(x+1) == false && map.containsKey(x - 1) == false
    6. then added to arraylist list.add(x)
    7. finally return list


     */

    public static List<Integer> findAllLonelyNumbersInTheArray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);

        List<Integer> list = new ArrayList<>(); // *** IMP declare ARRAYLIST to check and store lonely keys
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                int x = entry.getKey();
                //if (map.containsKey(x + 1) == false && map.containsKey(x - 1) == false) {
                if (!map.containsKey(x + 1) && !map.containsKey(x - 1)) {
                    list.add(x);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        //int[] nums = {10, 6, 5, 8}; //10,8
        int[] nums = {1, 3, 5, 3}; //1,5

        System.out.println(findAllLonelyNumbersInTheArray(nums));
    }
}
