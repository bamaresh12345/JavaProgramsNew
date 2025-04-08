package extraLearnALLRepeated;

import java.util.Arrays;

public class removeDuplicatesfromArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2};


        //System.out.println(Arrays.toString(removeDuplciates(arr)));
        System.out.println(removeDuplciates(arr));
    }

    private static int removeDuplciates(int[] arr) {

        int left=0;

        for (int right = 0; right < arr.length; right++) {

            if(right < arr.length-1 && arr[right]==arr[right + 1] )
            {
                continue;
            }
            else
            {
                arr[left++] = arr[right];
            }
        }
        return left;
    }

}
