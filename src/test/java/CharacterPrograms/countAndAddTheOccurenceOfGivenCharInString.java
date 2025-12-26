package CharacterPrograms;

public class countAndAddTheOccurenceOfGivenCharInString {

    public static void countAndAddTheOccurenceOfGivenCharInString(String str, char ch)
    {

        char[] chars = str.toCharArray();
        String newStr="";
        int count=1;
        for (int i=0; i<chars.length; i++)
        {
          if(chars[i]==ch)
          {
             newStr = newStr + chars[i]+count;   // *** IMP
             count++;
          }
            else
          {
              newStr = newStr + chars[i];     // IMP
          }

        }

        System.out.println(newStr);

    }
    public static void main(String[] args) {

        String str = "amaresha";
        char ch= 'a';

        countAndAddTheOccurenceOfGivenCharInString(str,ch);


    }


}
