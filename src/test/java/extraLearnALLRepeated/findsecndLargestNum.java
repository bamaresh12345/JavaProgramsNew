package extraLearnALLRepeated;

import java.util.Arrays;

public class findsecndLargestNum {

    public static void main(String[] args) {

        int[] arr= {2,6,1,8,9,5,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
