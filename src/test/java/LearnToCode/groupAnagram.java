package LearnToCode;

import java.util.*;

public class groupAnagram {


    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();   // only ARRAY can be sorted that why convered to array of chars

            Arrays.sort(chars);   // /*** SORT is MUST

            String s = new String(chars);    // /*** convert for CHARS of ARRAY TO STRING

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());  // ** IMP  ap.put(s, new ArrayList<>());
            }

            map.get(s).add(strs[i]);       // ** IMP  map.get(s).add(strs[i])

        }

        list.addAll(map.values());   // ** IMP   list.addAll(map.values())

        return list;


    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}
