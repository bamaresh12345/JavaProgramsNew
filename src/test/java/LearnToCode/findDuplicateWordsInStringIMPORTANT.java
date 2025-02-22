package LearnToCode;

import java.util.HashMap;
import java.util.Map;

//asdfasdfasdfasdfsd Tesitng branch2
//updating*****************updatingasdfasdf
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
                System.out.println("duplicate key : " + entry.getKey() + " duplicate count: " + entry.getValue());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "this for testing is pelase ignore it, this is";

        findDuplicateWordsIngivenString(s);
    }
}
