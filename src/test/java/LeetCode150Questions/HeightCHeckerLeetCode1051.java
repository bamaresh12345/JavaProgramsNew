package LeetCode150Questions;

import java.util.Arrays;

public class HeightCHeckerLeetCode1051 {

    public static int heightChecker(int[] heights) {

        int[] sortedArray = heights.clone();

        Arrays.sort(sortedArray);

        int counter=0;

        for(int i=0; i< heights.length;i++)
        {
            if(heights[i]!= sortedArray[i])
            {
                counter++;
            }
        }

        return counter;

    }
    public static void main(String[] args) {

        int[] heights ={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }
}
