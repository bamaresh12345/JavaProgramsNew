package extraLearnALLRepeated;

import java.util.HashSet;
import java.util.Set;

public class duplicateelmlent {

    public static void main(String[] args) {

        String[] arr= {"java","c","c++","java","pyhotn","java"};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {



            if(set.add(arr[i]))
            {
               // set.add(arr[i]);
               // System.out.println(arr[i]);

            }
            else
            {
                System.out.println("Duplicate ele: " +arr[i]);
            }
        }
    }
}
