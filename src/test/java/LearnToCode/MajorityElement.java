package LearnToCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //brute force sort array and get the mid point of the array
    // will get the majority of element if that array
    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int majorityElment = nums.length / 2;
        return nums[majorityElment];  // ** IMP
    }

    public static void main(String[] args) {
        //int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {3, 2, 3};

        System.out.println("Brute force Approach --> " + majorityElement(nums));
        System.out.println("Maps  Approach --> "  +majorityElementUsingHashMap(nums));
    }

    /*
    1. create HashMap with Key and Integer and value as Integer
    2. run for loop till end of array
    3. store each element with number of times occurence in HasMap
    4. run for loop with Map.Entry and
    5. get the arr lenght /2 will get off of array
    6. check any occurnce of integer >= lenght /2 , then return the value and Majority value
     */
    public static int majorityElementUsingHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int majorityElement = (nums.length) / 2;
        int lk = 0, lv = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            /*if (entry.getValue() > majorityElement) { // ** <= is not right
              //  return entry.getKey();
            }*/

            if (entry.getValue() > lv) {
                lv = entry.getValue();
                lk = entry.getKey();

            }


        }
        return lk;
    }
}

