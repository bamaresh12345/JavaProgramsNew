package LeetCode150Questions;

import java.util.*;

/*
242. Valid Anagram Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1: Input: s = "anagram", t = "nagaram"
Output: true

Example 2: Input: s = "rat", t = "car"
Output: false

 */
public class ValidAnagramIMPORTANTGroupAnagram {
    /*
    1. create array with 26 intgers to store  value based on ASCII
    2. run for loop till end of string s length
    3. based on each char of s and its ASCII value incrment the int array with 1
    4. based of each char of t String and its ASCII value , decrment the int array with 1
    5. finally run the for loop on int array which has 26 length
    6. if the any of array int is not set to 0 , return false
    7. else return true
     */
    public static boolean validAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static List<String> groupAnagram(String[] strs) {

        List<String> list = new ArrayList<>();
        boolean b = false;
        for (int i = 0; i < strs.length; i++) {

            for (int j = i + 1; j < strs.length; j++) {
                System.out.println(strs[i]);
                //String s1=strs[i];
                b = validAnagram(strs[i], strs[j]);
                if (b) {
                    list.add(strs[i]);
                    b = false;
                }
            }
        }


        return list;
    }

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";


        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};


        System.out.println("****************");
        // System.out.println(map);
        System.out.println("****************");

        System.out.println(validAnagram(s, t));

        System.out.println("*******ACTUAL*********");
        //System.out.println(groupAnagramMAps(strs));
        System.out.println(groupAnagrams(strs));
        //System.out.println(groupAnagramMAps3(strs));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list1 = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; // To track processed strs


        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                List<String> list2 = new ArrayList<>();
                list2.add(strs[i]);
                visited[i] = true;


                for (int j = i + 1; j < strs.length; j++) {
                    if (!visited[j] && validAnagram(strs[i], strs[j])) {
                        list2.add(strs[j]);
                        visited[j] = true;

                    }
                }
                list1.add(list2);
            }
        }
        return list1;
    }

    public static List<List<String>> groupAnagramMAps(String[] strs) {

        List<List<String>> list = new ArrayList<>();  // ***  IMP
        Map<String, List<String>> map = new HashMap<>();    // ***  IMP

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();      // ***  IMP

            Arrays.sort(chars);                      // ***  IMP

            String sortedStr = new String(chars); // create a new string

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());  // ***  IMP
            }

            map.get(sortedStr).add(strs[i]);  // ***  IMP

        }

        list.addAll(map.values());  // ***  IMP

        return list;

    }
}
