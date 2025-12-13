package LearnToCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsInGivenStringIMP_STAR {

   // public static Map<Character, Integer> findDuplicateCharsInGivenString(String str) {
    public static boolean findDuplicateCharsInGivenString(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate key : " + entry.getKey() + " Duplicate value : " + entry.getValue());
                 return true;
            }
        }
        //return map;
        return false;
    }

    public static void main(String[] args) {
        String str = "testing";

        System.out.println(findDuplicateCharsInGivenString(str));
        System.out.println( "with sets --> " + findDuplicateWordsInStringwithSets(str));
        System.out.println( "with 2 for loops --> " + findDuplicateWordsInStringwithForLoop(str));


    }

    public static boolean findDuplicateWordsInStringwithSets(String str )
    {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++)
        {
            if(!set.add(str.charAt(i)))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean findDuplicateWordsInStringwithForLoop(String str)
    {
        for (int i=0; i<str.length(); i++)
        {
            for (int j=i+1; j< str.length(); j++)
            {
                if(str.charAt(i)== str.charAt(j))
                    return true;
            }
        }

        return false;
    }
}

