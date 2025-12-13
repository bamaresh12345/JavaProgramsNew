package TLeanringDontCheckThisFolder;

public class ReverseWordInString {


    public static void reverseString(String s)
    {
        String words[] = s.split(" ");
        String rev = "";
        for (int i=0 ; i< s.length(); i++)
        {

           // rev = words[i] +" " +  rev;
            rev = s.charAt(i)  +  rev;

        }

        System.out.println(rev);

    }
    public static void main(String[] args) {


        String s = "This is for tesitng";

        reverseString(s);
    }
}
