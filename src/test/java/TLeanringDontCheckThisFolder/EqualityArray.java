package TLeanringDontCheckThisFolder;

import java.util.Arrays;

public class EqualityArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,2,1,4,5};


        if(arr1.length!=arr2.length)
            System.out.println("Not Equal");

        if(Arrays.equals(arr1,arr2))
            System.out.println("Equal arrays");
        else
            System.out.println("Not Equal");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
            System.out.println("Equal arrays");
        else
            System.out.println("Not Equal");
    }
}
