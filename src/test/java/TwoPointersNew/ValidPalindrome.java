package TwoPointersNew;

public class ValidPalindrome {

    public static boolean checkValidPalindorme(String s)
    {
       s = s.replace(" ", "");
       s = s.replaceAll("[^a-z-A-Z]", "");
       s = s.toLowerCase();
        System.out.println(s);

        int left=0;
        int right= s.length()-1;

        while(left < right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }


       return true;

    }
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        int n=12321;
        System.out.println("checkValidPalindorme " +checkValidPalindorme(s));
        System.out.println("checkValidPalindormeNumber " + checkValidPalindormeNumber(n));

    }

    public static boolean checkValidPalindormeNumber(int n) {

        System.out.println("Number " + n);
        String s = Integer.toString(n);

        System.out.println("Number to String " + s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }


        return true;
    }
}
