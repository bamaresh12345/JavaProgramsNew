package LearnToCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//asdfasdfasdfasdfsd Tesitng branch2
//updating*****************updatingasdfasdf

// COUNT CHARACTER/STRING/NUMBERS can be only with MAPS , duplicate count , unique count etc..
// FIND can be with MAPS ,SETS and 2 FOR LOOPS  --> return TRUE or FALSE
public class findDuplicateWordsInStringIMPORTANT {

    public static void findDuplicateWordsIngivenString(String s) {
        // datastructures we have in java arrys,steing,Maps,List,sets etc
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split(" +");
        for (int i = 0; i < words.length; i++) // run for loop till the end of the array
        {
            if (map.containsKey(words[i]))  // check if already map contains the string , if yes
            {

                map.put(words[i], map.get(words[i]) + 1);  //store word and non of times the word in sentence
            } else  // if map does not contains strings then add it into map
            {
                map.put(words[i], 1); // adding word initally into map with 1 and counter

            }
        }

        System.out.println(countWords(map));


    }

    public static Map<String, Integer> countWords(Map<String, Integer> map) { // retunr type and paramenter
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate key : " + entry.getKey() + " || Duplicate count: " + entry.getValue());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        //String s = "this for testing is pelase ignore it, this is";  // with duplicates  --> OUTPUT TRUE
        String s = "this for testing is pelase ignore it";  // without duplicates  --> OUTPUT FALSE

        findDuplicateWordsIngivenString(s);
        System.out.println( "*** WITH SETS--> " +findDuplicateWordsInStringwithSets(s));
        System.out.println( "**** WITH 2 FOR LOOPS--> " +findDuplicateWordsInStringwithForLoop(s));
    }

    public static boolean findDuplicateWordsInStringwithSets(String str )
    {
        Set<String> set = new HashSet<>();
         String[] arr = str.split(" ");   // *** IMP str.split(" ")
        for(int i=0; i<arr.length; i++)
        {
            if(!set.add(arr[i]))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean findDuplicateWordsInStringwithForLoop(String str)
    {
        String[] arr1 = str.split(" ");

        for (int i=0 ; i<arr1.length; i++)
        {
            for (int j=i+1; j<arr1.length; j++)
            {
                if(arr1[i].equals(arr1[j]))
                    return true;
            }
        }

        return false;
    }
}
