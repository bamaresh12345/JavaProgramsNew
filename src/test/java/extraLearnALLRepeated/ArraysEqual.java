package extraLearnALLRepeated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEqual {

    public static void main(String[] args) {
        int[] arr1= {2,6,8,9};
        int[] arr2= {2,6,9,8,10};

        System.out.println("arrays eual " +Arrays.equals(arr1,arr2));


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arrays eual " + Arrays.equals(arr1,arr2));


        List<Integer> lsit1 = new ArrayList<>();
        List<Integer> lsit2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            lsit1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            lsit2.add(arr2[i]);
        }

        System.out.println(lsit1.containsAll(lsit2));
        System.out.println(lsit2.containsAll(lsit1));

    }
}
