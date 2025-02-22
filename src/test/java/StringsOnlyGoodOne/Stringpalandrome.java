package StringsOnlyGoodOne;

public class Stringpalandrome {

    public static boolean ValidPalandrome(String s) {
        s = s.toLowerCase(); // convert to all thechars to lower case
        s = s.replaceAll("[^A-Za-z0-9]", ""); // remove all the spacial cahrs

        String rev = "";

        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }

        if (s.equals(rev))
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s = "race a car";

        System.out.println(ValidPalandrome(s));
        System.out.println(validPalindromeRecacive(s));

    }

    public static boolean validPalindromeRecacive(String s) {

        if (s == null)
            return false;

        if (s.length() <= 0) {
            return false;
        }


        String frist = s.substring(0, 1);                        // *** IMP
        String last = s.substring(s.length() - 1, s.length());   // *** IMP
        if (!frist.equals(last)) {                                // *** IMP
            return false;
        } else {
            return validPalindromeRecacive(s.substring(1, s.length() - 1)); // *** IMP
        }


    }
}
