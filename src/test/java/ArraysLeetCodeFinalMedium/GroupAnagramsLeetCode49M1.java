package ArraysLeetCodeFinalMedium;

/* 49. Group Anagrams Medium
Given an array of strings strs, group the anagrams  together. You can return the answer in any order.

Example 1:  Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2: Input: strs = [""]  Output: [[""]]
Example 3: Input: strs = ["a"] Output: [["a"]]

 */

import java.util.*;

public class GroupAnagramsLeetCode49M1 {

    /*
    1. declare List<List<String>> result = new ArrayList<>();
    2. declare HashMap as Map<String,List<String>> = new Hashmap<>(); to store sorted string and acutal anagram strings
    2a. run for loop till end of strs.length
    3. convert char[] chars = str[i].toCharArray()   *for each string in array
    4. sort the string using Arrays.sort(chars);
    5. convert that to new String like String sortedString = new String(chars);
    6. check if not map.ContainsKey(of sorted string)
    7. add sorted string as key and check new ArryList  --> map.put(sortetedString, new ArrayList<>());
    8. else get the sorted string key and add value --> map.get(SortedString).add(str);
    9. finally add all to result list--> result.addAll(map.values());
    10. return the results
     */

    public static List<List<String>> GroupAnagrams(String[] strs) // List<List<String>> return trye is IMP**
    {
        List<List<String>> result = new ArrayList<>(); // *** VERY IMP
        Map<String, List<String>> map = new HashMap<>();  // *** VERY IMP
        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray(); // Convert to char array

            Arrays.sort(chars);   // sort array

            String sortedString = new String(chars);  // create new sortedstring

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            // ELSE loop will fail it, dont use else loop --> if use else it will add only 1 value , next timewill not add other value
            map.get(sortedString).add(strs[i]); // **VERY IMP first MAP.get and .add(strs[i]) *** IMP


        }
        result.addAll(map.values()); // ADD all values**** IMP
        return result;


    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(GroupAnagrams(strs));
    }
}
