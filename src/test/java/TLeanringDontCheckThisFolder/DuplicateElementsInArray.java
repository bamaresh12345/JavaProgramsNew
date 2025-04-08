package TLeanringDontCheckThisFolder;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        String[] arr = {"java","c","paython","java","c","java"};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i].equals(arr[j]))
                {
                    System.out.println("duplicate eellments " +arr[i]);
                   flag = true;
                }
            }
        }

        if(flag == false)
        {
            System.out.println("duplicate eellments not found ");
        }


        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.add(arr[i]) == false)
            {   System.out.println(" set duplicate eellments " +arr[i]);
            }


        }




    }
}
