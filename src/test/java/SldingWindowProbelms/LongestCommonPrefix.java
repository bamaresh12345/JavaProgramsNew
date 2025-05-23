package SldingWindowProbelms;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        //point to fist element

        // go with for loop ,start with 1st element till it legnth of array is end

        //look for indexof(second element) . if not found decremnt the prefix of 1st elemnt till it fieds
        // the element
        //finally return prefix value

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

    }
}
