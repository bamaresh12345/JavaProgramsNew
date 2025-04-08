package LeetcodeApple.twoPointer;

import java.util.Arrays;

public class RemoveDuplicatedFromSoretedArrayII {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};

        System.out.println(Arrays.toString(removeDuplicatedFromSoretedArrayII(arr)));
    }

    private static int[] removeDuplicatedFromSoretedArrayII(int[] arr) {

        int index=0;
        for (int n : arr)
        while(index <2 || n !=arr[index-1])
        {
            arr[index] = n;
            index++;
        }
        return arr;
    }
}
