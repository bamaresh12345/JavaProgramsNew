package LeetCode150Questions;

public class CheckPalandrome {

    public static boolean checkPalandrome(String s)
    {
        int left=0;
        int right=s.length()-1;

        while(left < right)
        {
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
           left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s ="maasdasdam";
        System.out.println(checkPalandrome(s));
    }
}
