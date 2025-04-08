package extraLearnALLRepeated;

import groovy.xml.StreamingDOMBuilder;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));

    }

    private static List<List<String>> groupAnagrams(String[] arr) {

        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

              char[] chars = arr[i].toCharArray();
              Arrays.sort(chars);  //sort array
              String s = new String(chars);

              if(!map.containsKey(s))
              {
                  map.put(s, new ArrayList<>());
              }
               // else loop will fail it , dont use else loop
                  map.get(s).add(arr[i]);   // map.get(s).add(arr[i])


        }

        list.addAll(map.values());   // lsit.addAll(map.values())

        return list;   // retunr list
    }


}
