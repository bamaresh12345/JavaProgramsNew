package LeetCode150Questions;

public class findLengthofString0 {

    public static int findLengthofString(String s)
    {
        int left=0;
        int zeros=0;
        int maxLen=0;

        for (int right = 0; right < s.length(); right++) {

            if(s.charAt(right)=='0') // *** IMP '0'
            {
                zeros++;
            }

            while(zeros > 1)
            {
                if(s.charAt(left)=='0') {  // *** IMP '0'
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen , right-left+1);

        }
        return maxLen;
    }

    public static void main(String[] args) {

        String s = "1101100111";

        System.out.println(findLengthofString(s));


    }
}
