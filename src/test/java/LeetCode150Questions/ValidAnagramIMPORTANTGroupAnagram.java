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

    public static List<List<String>> groupAnagramMAps(String[] strs) {

        List<List<String>> list = new ArrayList<>();  // ***  IMP
        Map<String, List<String>> map = new HashMap<>();    // ***  IMP

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();      // ***  IMP
            //Sort array of chars
            Arrays.sort(chars);

            // create new string of cahrs
            String sortedStr = new String(chars); // create a new string

            //Check if map doesnt contains sorted string, then create new arraylist with with key
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());  // ***  IMP
            }
            //Check if map contains sorted string, then to already exisitng array list
            map.get(sortedStr).add(strs[i]);  // ***  IMP

        }

        list.addAll(map.values());  // ***  IMP

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

       // System.out.println(validAnagram(s, t));

        System.out.println("*******ACTUAL*********");
        System.out.println(groupAnagramMAps(strs));

    }



}
