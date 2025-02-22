package LeetCode150Questions;

import java.util.Arrays;

public class SortArrayOfStringWithLengthofString {


    public static String[] sortArray(String[] strs) {
    /* run for loop with i till end of array
    2. run one more for loop till end of array starting i+1
    3. compare elelment of array i with array of j if i> j
    4. swapt the array withtemp val iralve
    5. finally return sorted array
    */
        String temp = "";
        for (int i = 0; i < strs.length; i++) {   //strs.length***  NOT length()***
            for (int j = i + 1; j < strs.length; j++) {   //strs.length***  NOT length()***

                if (strs[i].length() > strs[j].length()) {
                    temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }

        }

        return strs;

    }

    public static void main(String[] args) {

        //int[] nums = {5,2,3,1};
        String[] strs = {"rama", "sam", "a", "ab", "this"};

        System.out.println(Arrays.toString(sortArray(strs)));

    }

}
