package LeetCode150Questions;

public class CountCharsRepeatedWorDay {

    public static void CountCharsRepeated(String str)
    {
        int count=1;
        for (int i=0; i<str.length(); i++)
        {
            while(i< str.length() -1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }

            System.out.print( str.charAt(i) +"" + count );
            count=1;

        }

    }

    public static void CountCharsRepeated2(String str)  // ****** EASY ONE *****
    {
        int count=1;
        String val = "";
        char ch='0';
        char[] chars = str.toCharArray();

        for (int i=0; i<chars.length; i++)
        {
              if( i<chars.length-1 && chars[i]== chars[i+1])
              {
                  count++;
                  continue;

              }
              else
              {
                  val = val+""+chars[i] + count;   // "" is IMP*** and Val is IMP***
                  count=1;  /// Count =1 is IMP*****
              }
        }
        System.out.println("**************");
        System.out.println(val);
    }



    public static void main(String[] args) {

        String str = "abbbbccddaaab";  // OUTPUT --> a1b4c2d2a3b1    , simialr to duplicate chars but can be repeated with next a char

        CountCharsRepeated(str);
        CountCharsRepeated2(str);

    }
}
