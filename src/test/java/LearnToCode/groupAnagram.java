package LearnToCode;

import java.util.*;

public class groupAnagram {


    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);

            String s = new String(chars);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }

            map.get(s).add(strs[i]);

        }

        list.addAll(map.values());

        return list;


    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}
