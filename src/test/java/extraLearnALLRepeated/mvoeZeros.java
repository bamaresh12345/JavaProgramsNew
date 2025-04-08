package extraLearnALLRepeated;

import java.util.Arrays;

public class mvoeZeros {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        System.out.println(moveZeros(arr));
    }

    private static int moveZeros(int[] arr) {

        int left=arr.length-1;
        for (int right = arr.length-1; right >=0 ; right--) {

            if(arr[right]!=0)
            {
                arr[left] = arr[right];
                left--;
            }
            else
            {
                continue;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(left);
        for (int i = left; i >=0; i--) {

            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));
        return 1;
    }
}
