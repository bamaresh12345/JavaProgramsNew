package LeetCode150Questions;

public class SubSequence {

    public static boolean checkforSubSequence(String s,String t)
    {
        int left=0;
        int right=0;

        while(left < s.length() && right <t.length()) // *** IMP
        {
            if(s.charAt(left)!=t.charAt(right))
            {
                left++;
            }
            right++;
        }

        if(left==s.length())
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahgdc";

        System.out.println(checkforSubSequence(s,t));
    }
}
