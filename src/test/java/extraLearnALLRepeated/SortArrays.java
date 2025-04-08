package extraLearnALLRepeated;

import java.util.Arrays;
import java.util.Collections;

public class SortArrays {

    public static void main(String[] args) {
        Integer[] arr= {2,5,8,9,10,12,18,21,28};
        int[] arr1= {2,5,8,9,10,12,18,21,28};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //Reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}
