package ServiceCompanyInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWithSetsANDHAshMapsApple {


    public static String[] removeDuplicates(String[] array) {

        // Using HashSet to store unique strings
        //Set<String> set = new HashSet<>(Arrays.asList(array));  OR
        Set<String> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        // Convert back to array
       // return set.toArray(new String[0]);   or
        String [] arr2= new String[set.size()];
        int i=0;
        for (String s : set)
        {
            arr2[i]=s;
            i++;
        }

        return arr2;
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "apple", "orange", "banana", "grape"};
        String[] result = removeDuplicates(input);
        String[] result2 = removeDuplicatesMethod2(input);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    public static String[] removeDuplicatesMethod2(String[] array) {
        int n = array.length;
        int index = 0;

        Arrays.sort(array); // Sorting makes duplicates adjacent

        for (int i = 0; i < n; i++) {
            // Skip duplicates
            if (i < n - 1 && array[i].equals(array[i + 1])) {
                continue;
            }
            array[index++] = array[i];
        }

        return Arrays.copyOf(array, index); // Copy only unique elements
    }
}
